package BookStores;

import java.io.*;

@SuppressWarnings("serial")
public class SellbookCommand extends Command implements java.io.Serializable{

	
	private String bookName;
	private String fileName = "Command.ser";
	
	SellbookCommand(String newbookName){
		this.bookName = newbookName; 
	}
	
	
	@Override
	public void execute(Inventory newInvent) {
		try {
			  newInvent.sellbook(bookName);
		} catch (MatchNotFoundException e) {
			System.out.println(e);
		}

		try
	      {
	         FileOutputStream fileOut = new FileOutputStream(fileName,true);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(this);
	         out.close();
	         fileOut.close();
	        
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	        
	      }
		
	}

}
