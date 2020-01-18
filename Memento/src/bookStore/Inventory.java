package bookStore;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Inventory implements InventoryInterface {

	private ArrayList<Book> bookCollection = new ArrayList<Book>();
	private Memento memento = new Memento();
	private InventoryDecorator invent ;
	private String CommandFileName = "Command.ser";
	private Integer numberOfState=0, timeToSave =3;
	
	public ArrayList<Book> getBookCollection() {
		return bookCollection;
	}

	public void setBookCollection(ArrayList<Book> bookCollection) {
		this.bookCollection = bookCollection;
	}
	public void addBook(Book newBook){
		bookCollection.add(newBook);
		if(++numberOfState == timeToSave){
	    	this.saveState();
	    	numberOfState=0;
	    }
	}
	public void sellBook(String bookName) throws MatchNotFoundException{
		for(Book book : this.bookCollection){
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
	
	public void addCopy(String bookName, Integer NumberOfCopy )throws MatchNotFoundException{
		for(Book book : this.bookCollection){
			
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
	
	public void changePrice(String bookName,Integer newPrice)throws MatchNotFoundException{
		for(Book book : this.bookCollection){
			
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
	
	public Integer findPriceByName(String bookName) throws MatchNotFoundException{
		
		for(Book book : bookCollection){
			if(book.getName().equals(bookName)){
				return book.getPrice();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}
	
	public Integer findQuantityByName(String bookName) throws MatchNotFoundException{
		
		for(Book books : this.bookCollection){
			if(books.getName().equals(bookName)){
				return books.getQuantity();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}
	public Integer findQuantityByID(Integer bookID) throws MatchNotFoundException{
		for(Book book : this.bookCollection) {			
			if(book.getUniqueID().equals(bookID)){
				return book.getQuantity();
			}
				
		}
		throw new MatchNotFoundException("No Match Found");
	}
	
	public Integer findPriceByID(Integer bookID) throws MatchNotFoundException{
		for(Book book : this.bookCollection){
			
			if(book.getUniqueID().equals(bookID)){
				return book.getPrice();
			}
		}
		throw new MatchNotFoundException("No Match Found");

	}	
	public void saveState(){
	    memento.saveState(getBookCollection());
	    File file = new File(CommandFileName);
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void getState(){
		
		invent.getState(); 
		invent.getInvent().getBookCollection();
	}
}
