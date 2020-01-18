package Project;

import java.util.ArrayList;

public class Inventory implements Inventory_interface{
	//สร้างการทำงาน ข้อมูลของร้านหนังสือ
	private ArrayList<Book> book = new ArrayList<Book>();;
	private int numberState = 0;
	private int timeSaveState = 3;
	private Integer quantity;
	private InventoryDecorator inventory;
	
	
	
	public Inventory() {
		
	}

	public ArrayList<Book> getBookCollection() {
		return book;
	}
	
	public void setBookCollection(ArrayList<Book> bookCollection) {
		this.book = bookCollection;
	}
	
	@Override
	public void addNewBook(Book newBook) {
		book.add(newBook);
		
	}


	@Override
	public void SellBook(String nameBook) {
		for(Book book : book) {
			
			if(book.getName().equalsIgnoreCase(nameBook) && book.getQuantity() > 0) {
				book.changQuatity(-1);;
				if(++numberState == timeSaveState) {
					this.saveState();
					timeSaveState = 0;
				}
				//return keyword in void method
				//return ตัวมันเอง
				return ;
			}
		}
		
	}


	@Override
	public void addCopyBook(String nameBookCopy, int countBookCopy) {
		for(Book book : book) {
			
			if(book.getName().equalsIgnoreCase(nameBookCopy)) {
				book.changQuatity(countBookCopy);
				if(++numberState == timeSaveState) {
					this.saveState();
					timeSaveState = 0;
				}
				
				return ;
			}
		}
		
	}


	@Override
	public void changePriceBook(String nameBook ,int newPrice) {
		for(Book book : book) {
			
			if(book.getName().equalsIgnoreCase(nameBook)) {
				book.setPrice(newPrice);
				if(++numberState == timeSaveState) {
					this.saveState();
					timeSaveState = 0;
				}
			}
			
			return ;
		}
		
	}


	@Override
	public Integer findQuantityByID(Integer bookID) {
		for(Book book : book) {
			
			if(book.getUniqueID().equals(bookID)) {
				this.quantity =  book.getQuantity();
			}
		}
		
		return this.quantity;
	}

	

	@Override
	public Integer findQuantityByName(String nameBook) {
		for(Book book : book) {
			
			if(book.getName().equalsIgnoreCase(nameBook)) {
				this.quantity = book.getQuantity();
			}
			
			
		}
		return this.quantity;
	}

	@Override
	public void saveState() {
		
	}

	@Override
	public void getState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer FindPriceByID(int bookID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer FindPriceByName(String nameBook) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
