package Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SellBookCommand extends Command{

	private String bookName;
	private String fileName = "Command.ser";
	
	public SellBookCommand(String bookname) {
		this.bookName = bookname;
	}
	
	@Override
	public void excute(Inventory newInvent) {

			newInvent.SellBook(bookName);

		try {
			FileOutputStream file = new FileOutputStream(fileName,true);
			ObjectOutputStream output = new ObjectOutputStream(file);
		
			output.writeObject(this);
			output.close();
			
			file.close();
		
		}catch(IOException i ) {
			i.printStackTrace();
		}
		
	}

	
}
