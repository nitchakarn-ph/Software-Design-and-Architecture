package bookStore;
import java.util.ArrayList;
 
@SuppressWarnings("serial")
public class Memento implements java.io.Serializable{

	private ArrayList<Book> bookCollection;
	
	public void saveState(ArrayList<Book> newBooksCollection){
		
		this.bookCollection = new ArrayList<Book>(newBooksCollection);
		
	}
	
	public ArrayList<Book> getState(){
		
		return this.bookCollection;
		
	}
}