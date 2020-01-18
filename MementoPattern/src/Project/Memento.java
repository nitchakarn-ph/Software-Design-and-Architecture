package Project;

import java.util.ArrayList;

public class Memento {
	//��ʶҹТͧ object
	private ArrayList<Book> bookCollection;
	
	/*public Memento(String state) {
		this.state = state;
	}*/
	
	public void saveState(ArrayList<Book> newBookCollection) {
		this.bookCollection = newBookCollection;
	}
	
	public ArrayList<Book> getState() {
		return this.bookCollection;
	}
}
