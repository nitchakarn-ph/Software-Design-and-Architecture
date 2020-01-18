package Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddBookCommand extends Command{

	private Book book;
	private String fileName = "Command.txt";
	
	public AddBookCommand(Book newBook) {
		this.book = newBook;
	}
	
	@Override
	public void excute(Inventory newInvent) {
		
		newInvent.addNewBook(book);
		
		//ทำการอ่าน และเขียน โดยใช้ ObjectOutputStream
		try {
			FileOutputStream file = new FileOutputStream(fileName,true);
			//FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream output = new ObjectOutputStream(file);
		
			output.writeObject(this);
			output.close();
			file.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
