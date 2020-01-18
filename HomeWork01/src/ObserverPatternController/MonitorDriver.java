package ObserverPatternController;

public class MonitorDriver implements Observer {

	private String name ;
	private Driver controllData;
	
	public MonitorDriver(Controller c) {
		
		this.controllData = c;
		this.controllData.registerObserver(this);
	
	}
	
	@Override
	public void update(String name) {
		this.name = name;
		display();
	}
	
	public void display() {
		if(name.equalsIgnoreCase("monitor")) {
			System.out.println("Driver is "+name);
		}
		
	}

}
