package BookStore;

public class Main {

	public static void main(String[] args) {
		/*Integer price;
	    Integer testPrice=500;
	    Integer quatity;
	    
	    
	    
		InventoryDecoratorss invent = new InventoryDecoratorss();
	    invent.addBook(new Books("MIB-1", 500, 5));
	       
	   	
		price = invent.findPriceByName("MIB-1");
		System.out.println("Price is : " + price);
		
		invent.addBook(new Books("Math",250,10));
		
		System.out.println("----- sold-------");
		invent.sellBook("MIB-1");
		invent.saveState();
		
		*/
		
		/*
		quatity = invent.findPriceByID(2);
		System.out.println("Quatiry is " +quatity);
		
		invent.changePrice("Math",450 );
		price = invent.findPriceByName("Math");
		System.out.println("New Price : "+ price);
	    */		     
			       InventoryDecorators invent = new InventoryDecorators();
			       Integer price;
			       
			       invent.addBook(new Books("MIB-1", 500, 5));
			       invent.addBook(new Books("MIB-2", 600, 5));
			       invent.addBook(new Books("MIB-5", 700, 5));
			       invent.addCopy("MIB-1", 5); 
					//try{	
						price = invent.findQuantityByID(1);
						System.out.println("Match found " + price);
					//}
					/*catch( MatchNotFoundException e)
					{
						
						System.out.println("Match not found ");
					}*/
				   //invent.saveState();
			       
			      InventoryDecorators invent2 = new InventoryDecorators();
			      invent2.getState();
			      invent2.addBook(new Books("MIB-4", 800, 5));
			      invent2.sellBook("MIB-1");
			      //try{	
						price = invent2.findQuantityByName("MIB-1");
						System.out.println("Match found " + price);
					//}catch(MatchNotFoundException e)
					//{
						//System.out.println(e);
					//}
			      //try{	
						price = invent2.findPriceByName("MIB-2");
						System.out.println("Match found " + price);
					//}catch(MatchNotFoundException e)
					//{
						System.out.println("Match not found ");
					//}
			      //try{	
						price = invent2.findPriceByName("MIB-3");
						System.out.println("Match found " + price);
					//}catch(MatchNotFoundException e)
					//{
						System.out.println("Match not found ");
					//}
			      //try{	
						price = invent2.findPriceByName("MIB-4");
						System.out.println("Match found " + price);
					//}catch(MatchNotFoundException e)
					//{
						System.out.println("Match not found ");
					//}
					//	price = invent.findPriceByName("MIB-4");
			       
			       
			       
		
		

		}
}
