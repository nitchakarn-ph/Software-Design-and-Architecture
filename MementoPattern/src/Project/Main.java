package Project;



public class Main {
	public static void main (String[] arg) {
		Integer price;
		Integer testPrice = 500;
		
		InventoryDecorator invent = new InventoryDecorator();
		invent.addNewBook(new Book("MIB-1",500,5));
		//invent.addCopyBook("oooo", 2);
	
			/*price = invent.FindPriceByName("MTB-1");
			System.out.println(price);*/
		
		/*catch(MatchNotFoundException e) {
			System.out.println("Match not Found");
			price = 0;
		}*/
		
		/*price = invent.FindPriceByID(0);
		System.out.println(price);*/
	}
}
