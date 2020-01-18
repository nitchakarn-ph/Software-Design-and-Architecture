package ObserverPatternController;

public class PrinterDriver implements Observer {

	private String name;
	private Driver controllData;
	
	public PrinterDriver(Controller c) {
		
		this.controllData = c;
		this.controllData.registerObserver(this);
	
	}
	
	@Override
	public void update(String name) {
		this.name = name;
		display();
	}
	
	public void display() {
		if(name.equalsIgnoreCase("printer")) {
			System.out.println("Driver is "+ name);
		}
		
	}
	

}
