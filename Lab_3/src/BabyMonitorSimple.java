
public class BabyMonitorSimple implements Observer{
	private Subject mdata;
	private String name; //location
	private boolean crying;
	
	public BabyMonitorSimple(String location, Baby d) {
		this.name = location;
		this.mdata = d;
		this.mdata.registerObserver(this);
	}
	public void display() {
		if(this.crying) {
			System.out.println("Baby monitor simple");
			System.out.println(this.mdata);
			System.out.println(this.crying);
		}else {
			System.out.println("Not cry");
		}
	}
	 public void turnOff() {
		 
	}
	 public void update(String name,boolean crying,int level) {
		  this.crying = crying;
		  
		
		 
		 display();
		 
	 }
}
