package HW2;

public abstract class Machines {
	protected String name;
	protected Cabinet cabinet;
	protected Display diaplay;
	protected GPU gpu;
	protected OS os;
	
	public Machines() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void prepare() {
		System.out.println("preparing");
	}
	
	public abstract String toString() ;
	
}
