package BookStores;

import java.io.*;

@SuppressWarnings("serial")
public class ChangePriceCommand extends Command implements java.io.Serializable{

	
	private String bookName;
	private Integer numberOfCopy;
	private String fileName = "Command.ser";
	
	ChangePriceCommand(String newbookName, Integer newNumberOfCopy){
		this.bookName = newbookName; 
		this.numberOfCopy = newNumberOfCopy;
	}
	
	@Override
	public void execute(Inventory newInvent) {
		try {
		    newInvent.changePrice(bookName,numberOfCopy);
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
