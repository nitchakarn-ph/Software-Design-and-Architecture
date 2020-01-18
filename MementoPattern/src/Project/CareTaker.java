package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CareTaker {
	private String temporaryFileName = "temporaryInventory.ser";
	private String fileName = "Inventory.ser";
	private File tempFile = new File(temporaryFileName);
	private File file = new File(fileName);
	byte[] buf = new byte[1024];
	int bytesRead;
	private Object object;
	
	
	public void serialzeMemento(Memento state) {
		
		try {
			
			FileOutputStream temporaryFileOut = new FileOutputStream(temporaryFileName);
			ObjectOutputStream  out = new ObjectOutputStream(temporaryFileOut);
			out.writeObject(state);
			out.close();
			
			temporaryFileOut.close();
			tempFile.renameTo(file);
			
		}catch(IOException i) {
			i.printStackTrace();
		}
		
	}
	
	//การทำย้อนกลับ
	public Memento deserialseMemento() {
		
		try
		{
			FileInputStream fileInput = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileInput);
			object = in.readObject();
			in.close();
			fileInput.close();
			return (Memento)object;
			
		}catch(IOException i) {
			i.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException c) {
			System.out.println("class not found");
			c.printStackTrace(); //ใช้บอกว่าผิดตรงไหน >> บอกเป็นบรรทัด
			return null;
		}
		
	}
}
