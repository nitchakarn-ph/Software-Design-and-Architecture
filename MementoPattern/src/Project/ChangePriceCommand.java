package Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ChangePriceCommand extends Command{
	private String bookName;
	private Integer numberCopy;
	private String fileName = "Command.ser";
	
	public ChangePriceCommand(String newBookName,Integer newNumberCopy) {
		this.bookName = newBookName;
		this.numberCopy = newNumberCopy;
	}

	@Override
	public void excute(Inventory newInvent) {
		newInvent.changePriceBook(bookName, numberCopy);
		
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
