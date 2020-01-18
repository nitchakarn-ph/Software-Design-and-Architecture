package BookStores;

public class MainBook {

	public static void main (String[] args) throws MatchNotFoundException  {
		   InventoryDecorators invent = new InventoryDecorators();
	       Integer price;
	       
	       invent.addbook(new Book("MIB-1", 500, 5));
	       invent.addbook(new Book("MIB-2", 600, 5));
	       invent.addbook(new Book("MIB-5", 700, 5));
	        
	       
	       System.out.println(invent.getInvent().getbookCollection().get(0).getName());
			try{	
				price = invent.findPriceByID(1);
				System.out.println("Match found " + price);
			}
			catch( MatchNotFoundException e)
			{
				
				System.out.println("Match not found");
			}
			
			//invent.saveState();
		    //invent.getState();
		       
			
			 //sellBook 
		      System.out.println("----Sold-----");
		      invent.sellbook("MIB-1");
		      
		      try{	
					price = invent.findQuantityByName("MIB-1");
					System.out.println("Match found " + price);
				}catch(MatchNotFoundException e)
				{
					System.out.println(e);
				}
		      
		      //invent.saveState();
		      //invent.getState();
		      
		      //copy
		      System.out.println("----Copy-----");
		      invent.addCopy("MIB-1", 15);
		      
		      try {
		    	  price = invent.findQuantityByID(1);
		    	  System.out.println("Match found " + price);
		      }catch (MatchNotFoundException e) {
				System.out.println(e);
		      }
		      
		      //change price
		      System.out.println("---- change price ----");
		      invent.changePrice("MIB-1", 250);
		      
		      try {
		    	  price = invent.findPriceByID(1);
		    	  System.out.println("Match found "+ price);
		      }catch (MatchNotFoundException e) {
				System.out.println(e);
			}
		      
		      
		  invent.saveState();
		  invent.getState();
		  
		  InventoryDecorators invent2 = new InventoryDecorators();
	     // invent2.getState();
	      invent2.addbook(new Book("MIB-4", 800, 5));
	      
	     
	      System.out.println();
	      
	      System.out.println(invent2.getInvent().getbookCollection().get(0).getName());
	      System.out.println("----Sold-----");
	      invent2.sellbook("MIB-4");
	      try{	
				price = invent2.findQuantityByName("MIB-4");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println(e);
			}
	      
	      try{	
				price = invent2.findPriceByName("MIB-2");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
	      try{	
				price = invent2.findPriceByName("MIB-3");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
	      try{	
				price = invent2.findPriceByName("MIB-4");
				System.out.println("Match found " + price);
			}catch(MatchNotFoundException e)
			{
				System.out.println("Match not found ");
			}
			//	price = invent.findPriceByName("MIB-4");
	       
	       
	}
}
