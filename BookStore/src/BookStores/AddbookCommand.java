package BookStores;

import java.io.*;

@SuppressWarnings("serial")
public class AddbookCommand extends Command implements java.io.Serializable{

	private Book book;
	private String fileName = "Command.ser";
	
	public AddbookCommand(Book newbook){
		this.book = newbook; 
	}
	
	@Override
	public void execute(Inventory newInvent) {
		newInvent.addbook(book);
		
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
