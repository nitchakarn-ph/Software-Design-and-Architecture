package bookStore;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ChangePriceCommand extends Command implements java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String bookName;
	private Integer numberOfCopy;
	private String fileName = "Command.ser";
	
	ChangePriceCommand(String newBookName, Integer newNumberOfCopy){
	this.bookName = newBookName; 
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
