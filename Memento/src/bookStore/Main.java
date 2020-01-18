package bookStore;
public class Main {
	public static void main(String[] args) {

	       InventoryDecorator invent = new InventoryDecorator();
	       Integer quanlity,price;
	       
	       invent.addBook(new Book("MIB-1", 500, 5));
	       invent.addBook(new Book("MIB-2", 600, 1));
	       invent.addBook(new Book("MIB-5", 700, 6));
	       invent.addCopy("MIB-1", 5);
	       invent.addCopy("MIB-2", 3);
	       invent.sellBook("MIB-1");
			try{	
				quanlity = invent.findQuantityByID(1);
				System.out.println("Match found " + quanlity);
			}
			catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
		   
			  invent.saveState();
			  InventoryDecorator invent2 = new InventoryDecorator();
		      invent2.getState();
		      invent2.addBook(new Book("MIB-4", 800, 3));
		      invent2.sellBook("MIB-1");
		      try{	
					quanlity = invent2.findQuantityByName("MIB-4");
					System.out.println("Match found " + quanlity);
				}
		      catch(MatchNotFoundException e)
				{
					System.out.println(e);
				}
		      
		      try{	
		    	  	price = invent2.findPriceByName("MIB-2");
					System.out.println("Match found " + price);
				}
		      catch(MatchNotFoundException e)
				{
					System.out.println("Match not found ");
				}
		      
		      try{	
		    	  price = invent2.findPriceByName("MIB-3");
					System.out.println("Match found " + price);
				}
		      catch(MatchNotFoundException e)
				{
					System.out.println("Match not found ");
				}
		      
		      try{	
		    	  	price = invent2.findPriceByName("MIB-6");
					System.out.println("Match found " + price);
				}
		      catch(MatchNotFoundException e)
				{
					System.out.println("Match not found ");
				}
		      try{	
		    	  	price = invent2.findPriceByName("MIB-4");
					System.out.println("Match found " + price);
				}
		      catch(MatchNotFoundException e)
				{
					System.out.println("Match not found ");
				}
			//price = invent.findPriceByName("MIB-4");    
		 }
}
