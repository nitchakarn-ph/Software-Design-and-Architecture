package BookStores;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory implements InventoryInterface{

	private ArrayList<Book> bookCollection = new ArrayList<Book>();
	private Memento memento = new Memento();
	private InventoryDecorators invent ;
	private String CommandFileName = "Command.ser";
	private Integer numberOfState=0, timeToSave =3;
	
	public ArrayList<Book> getbookCollection(){
		return bookCollection;
	}
	
	public void setbookCollection(ArrayList<Book> bookCollection) {
		this.bookCollection = bookCollection;
	}
	
	@Override
	public void addbook(Book book) {
		bookCollection.add(book);
		if(++numberOfState == timeToSave){
	    	this.saveState();
	    	numberOfState=0;
	    }	
		
	}

	@Override
	public void sellbook(String bookName) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getName().equals(bookName) && book.getQuantity() > 0){
				book.changeQuantity(-1);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;
			}	
			
		}
		throw new MatchNotFoundException("No Match Found");
		
	}

	@Override
	public void addCopy(String bookName, Integer NumberOfCopy) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getName().equals(bookName)){
				book.changeQuantity(NumberOfCopy);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;
			}	
			
		}
		throw new MatchNotFoundException("No Match Found");
		
	}

	@Override
	public void changePrice(String bookName, Integer newPrice) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getName().equals(bookName)){
				book.setPrice(newPrice);
				if(++numberOfState == timeToSave){
			    	this.saveState();
			    	numberOfState=0;
			    }
				return ;
			}
		}
		throw new MatchNotFoundException("No Match Found");
		
	}

	@Override
	public Integer findPriceByName(String bookName) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getName().equals(bookName)){
				return book.getPrice();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}

	@Override
	public Integer findQuantityByName(String bookName) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getName().equals(bookName)){
				return book.getQuantity();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}

	@Override
	public Integer findQuantityByID(Integer bookID) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getUniqueID().equals(bookID)){
				return book.getQuantity();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}

	@Override
	public Integer findPriceByID(Integer bookID) throws MatchNotFoundException {
		for(Book book : bookCollection){
			
			if(book.getUniqueID().equals(bookID)){
				return book.getPrice();
			}
		}
		throw new MatchNotFoundException("No Match Found");
	}

	@Override
	public void saveState() {
		memento.saveState(bookCollection);
	    File file = new File(CommandFileName);
		file.delete();
		
		try {
			file.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getState() {
		invent.getState(); 
		bookCollection = (invent.getInvent().getbookCollection());
		
	}

	
	
}
