package BookStores;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Memento implements java.io.Serializable{

	private ArrayList<Book> bookCollection;
	
	public void saveState(ArrayList<Book> newbookCollection){
		this.bookCollection = new ArrayList<Book>(newbookCollection);
	}
	
	public ArrayList<Book> getState(){
		return this.bookCollection;
		
	}
}
