package Project;

public interface Inventory_interface {

	public void addNewBook(Book newBook) ;
	public void SellBook(String nameBook) ;
	public void addCopyBook(String nameBookCopy,int countBookCopy) ;
	public void changePriceBook(String nameBook,int newPrice) ;
	public Integer FindPriceByID(int bookID) ;
	public Integer FindPriceByName(String nameBook);
	public Integer findQuantityByID(Integer bookID);
	public Integer findQuantityByName(String nameBook);
	public void saveState();
	public void getState();
	
}
