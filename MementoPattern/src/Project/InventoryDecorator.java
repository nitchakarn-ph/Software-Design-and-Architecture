package Project;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InventoryDecorator implements Inventory_interface{
	
	private Inventory inventory = new Inventory();
	private ArrayList<Command> commandList = new ArrayList<Command>();
	private Memento memento = new Memento();
	private CareTaker careTaker = new CareTaker();
	private String commandFileName = "Command.ser";
	private FileInputStream fileIn;
	
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	@Override
	public void addNewBook(Book newBook) {
		AddBookCommand addBook = new AddBookCommand(newBook);
		addBook.excute(inventory);
	}

	@Override
	public void SellBook(String nameBook) {
		SellBookCommand sellBook = new SellBookCommand(nameBook);
		sellBook.excute(inventory);
		
	}

	@Override
	public void addCopyBook(String nameBookCopy, int countBookCopy) {
		AddCopyCommand copyBook = new AddCopyCommand(nameBookCopy,countBookCopy);
		copyBook.excute(inventory);
		
	}

	@Override
	public void changePriceBook(String nameBook, int newPrice) {
		ChangePriceCommand changePrice = new ChangePriceCommand(nameBook,newPrice);
		changePrice.excute(inventory);
	}

	@Override
	public Integer FindPriceByID(int bookID) {
		
		return inventory.FindPriceByID(bookID);
	}

	@Override
	public Integer FindPriceByName(String nameBook) {
		
		return inventory.FindPriceByName(nameBook);
	}

	@Override
	public Integer findQuantityByID(Integer bookID) {
		
		return inventory.findQuantityByID(bookID);
	}

	@Override
	public Integer findQuantityByName(String nameBook) {
		
		return inventory.findQuantityByName(nameBook);
	}

	/**
	   * This method get the commands from file  
	   * and also runs them to inventory object       
	   */
	
	private void replyCommmands(Inventory invent) {
		
		try {
			fileIn = new FileInputStream(commandFileName);
			while(true) {
				ObjectInputStream input = new ObjectInputStream(fileIn);
				commandList.add((Command)input.readObject());
				
			}
		}catch(EOFException e) {
			try {
				fileIn.close();
			}catch(IOException i) {
				i.printStackTrace();
			}
		}catch(IOException i) {
			i.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("class not found");
			c.printStackTrace();
		}
		
		for(Command command : commandList) {
			command.excute(inventory);
		}
		
	}
	
	
	@Override
	public void saveState() {
		memento.saveState(inventory.getBookCollection());
		careTaker.serialzeMemento(memento);
		
		File file = new File(commandFileName);
		file.delete();
		
		try {
			
			file.createNewFile();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void getState() {
		 memento = careTaker.deserialseMemento();
		 inventory.setBookCollection(memento.getState());
		 
		
	}
	
}
