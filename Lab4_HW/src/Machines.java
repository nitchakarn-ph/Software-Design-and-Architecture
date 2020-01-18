

import java.util.ArrayList;

public abstract class Machines {

	public String name;
	public String machines;
	public ArrayList component = new ArrayList();
	
	public Straight[] straight;
	public Bonus [] bonus;
	public Progress [] progress;
	
	public abstract void prepare();
	/*public void prepare() {
		System.out.println("Name : "+name);
		System.out.println("Adding software :");
		for(int i =0; i < component.size();i++) {
			System.out.println("\t"+ component.get(i));
		}
	}*/
	
	public void upload() {
		System.out.println("Upload software : "+machines);
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
