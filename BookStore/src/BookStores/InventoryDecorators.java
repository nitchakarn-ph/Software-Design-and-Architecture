package BookStores;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InventoryDecorators implements InventoryInterface{

	private Inventory invent = new Inventory();
	private FileInputStream fileIn ;
	private ArrayList<Command> commandCollection = new ArrayList<Command>();
	private CareTaker careTaker = new CareTaker();
	private Memento memento = new Memento();
	private String CommandFileName = "Command.ser";
	
	
	public Inventory getInvent() {
		
		return invent;
	}

	public void setInvent(Inventory invent) {
		
		this.invent = invent;
	}
	
	@Override
	public void addbook(Book book) {
		AddbookCommand addbook = new AddbookCommand(book);
		addbook.execute(invent);
		
	}

	@Override
	public void sellbook(String bookName) throws MatchNotFoundException {
		SellbookCommand sellMovie = new SellbookCommand(bookName);
		sellMovie.execute(invent);
	}

	@Override
	public void addCopy(String bookName, Integer NumberOfCopy) throws MatchNotFoundException {
		AddCopyCommand addCopy = new AddCopyCommand(bookName, NumberOfCopy);
		addCopy.execute(invent);
		
	}

	@Override
	public void changePrice(String bookName, Integer newPrice) throws MatchNotFoundException {
		ChangePriceCommand changePrice = new ChangePriceCommand(bookName, newPrice);
		changePrice.execute(invent);
		
	}

	@Override
	public Integer findPriceByName(String bookName) throws MatchNotFoundException {
		try {
			
			return invent.findPriceByName(bookName);
			
		} catch (MatchNotFoundException e) {
			
			throw new MatchNotFoundException("No Match Found");
		}
	}

	@Override
	public Integer findQuantityByName(String bookName) throws MatchNotFoundException {
		try {
			
			return invent.findQuantityByName(bookName);
			
		} catch (MatchNotFoundException e) {
			
			throw new MatchNotFoundException("No Match Found");
		}
	}

	@Override
	public Integer findQuantityByID(Integer bookID) throws MatchNotFoundException {
		try {
			 
			return invent.findQuantityByID(bookID);
			
		} catch (MatchNotFoundException e) {
			
			throw new MatchNotFoundException("No Match Found");
		}
	}

	@Override
	public Integer findPriceByID(Integer bookID) throws MatchNotFoundException {
		try {
			
			return invent.findPriceByID(bookID);
			
		} catch (MatchNotFoundException e) {
			
			throw new MatchNotFoundException("No Match Found");
		}
	}

	private void replyCommands(Inventory invent){
		
		try {
				  fileIn = new FileInputStream(CommandFileName);
				  while (true) {
					ObjectInputStream input = new ObjectInputStream(fileIn);
					//System.out.println(input.readObject());
				    commandCollection.add((Command)input.readObject());
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
	public void saveState() {
		memento.saveState(invent.getbookCollection());
		careTaker.serialzeMemento(memento);
		
		File file = new File(CommandFileName);
		file.delete();
		
		try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			
			}
		System.out.println("save state");
		
	}

	@Override
	public void getState() {
		memento = careTaker.deserialseMemento();
		invent.setbookCollection(memento.getState());
		
		this.replyCommands(invent);
		
		System.out.println("get state");
		
	}
	
}