import java.util.ArrayList;

public abstract class Slot {
	protected String name;
	protected Cabinet cabinet;
	protected Payment payment;
	protected Display display;
	protected GPU gpu;
	protected OS os;
	
	abstract void componets() ;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
