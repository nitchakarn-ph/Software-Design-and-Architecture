package BookStore;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InventoryDecorators implements InventoryInterfaces{

	
	private Inventory invent = new Inventory();
	private FileInputStream fileIn ;
	private ArrayList<Command> commandCollection = new ArrayList<Command>();
	private CareTaker careTaker = new CareTaker();
	public Memento memento = new Memento();
	private String CommandFileName = "Command.ser";
	
	public Inventory getInvent() {
		
		return invent;
	}

	public void setInvent(Inventory invent) {
		//�� invent �ҡ���� inventory �������¡�� method �Ӿǡ��������������
		//�ǡ find ��ҧ�
		this.invent = invent;
	}
	
	/*
	 * addBook
	 * �зӡ�����¡ method �ͧ command class �繡���� pattern Command
	 * ��� �зӡ�� ������� method �ͧ��÷ӧҹ��� 
	 */
	
	@Override
	public void addBook(Books book) {
		AddBookCommand addBook= new AddBookCommand(book);
	    addBook.execute(invent);
		
	}

	@Override
	public void sellBook(String bookName) {
		SellBookCommand sellBook = new SellBookCommand(bookName);
		sellBook.execute(invent);
		
	}

	@Override
	public void addCopy(String bookName, Integer NumberOfCopy) {
		AddCopyCommand addCopy = new AddCopyCommand(bookName, NumberOfCopy);
		addCopy.execute(invent);
		
	}

	@Override
	public void changePrice(String bookName, Integer newPrice) {
		ChangePriceCommand changePrice = new ChangePriceCommand(bookName, newPrice);
		changePrice.execute(invent);
		
	}

	/*
	 * method �ҡ inventory
	 */
	@Override
	public Integer findPriceByName(String bookName) {
		
			return invent.findPriceByName(bookName);
			
		
	}

	@Override
	public Integer findQuantityByName(String bookName) {
		
			return invent.findQuantityByName(bookName);
			
		
	}

	@Override
	public Integer findQuantityByID(Integer bookID) {
		
			 
			return invent.findQuantityByID(bookID);
			
		
	}

	private void replyCommands(Inventory invent){
		
		try {
				  fileIn = new FileInputStream(CommandFileName);
				  while (true) {
					ObjectInputStream input = new ObjectInputStream(fileIn);
				    commandCollection.add((Command) input.readObject());
				  }  
				}catch (EOFException e) {
					
					try{	
						fileIn.close();
					}catch(IOException i)
					{
						i.printStackTrace();
					}
					
				}catch(IOException i)
				{
					i.printStackTrace();
				}catch(ClassNotFoundException c)
				{
					System.out.println("class not found");
					c.printStackTrace();
				}
			
			for(Command command : commandCollection){
		         command.execute(invent);
			}
	}
	
	@Override
	public Integer findPriceByID(Integer bookID) {
		
			return invent.findQuantityByID(bookID);
			
		
	}

	@Override
	public void saveState() {
		memento.saveState(invent.getBookCollection());
		careTaker.serialzeMemento(memento);
		
		File file = new File(CommandFileName);
		file.delete(); //����������Ҷ١ź��� ?
		
		try {
			//������١ź ������ҧ�������
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void getState() {
		memento = careTaker.deserialseMemento();
		invent.setBookCollection(memento.getState());
		this.replyCommands(invent);
		
	}

}
