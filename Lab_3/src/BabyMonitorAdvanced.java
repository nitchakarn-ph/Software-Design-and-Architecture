
public class BabyMonitorAdvanced  implements Observer{
	private Subject mdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;
	
	public BabyMonitorAdvanced (String name,Baby m,Baby c) {
		this.name = name;
		this.mdata = m;
		
		
	}
	
	public void update(String name,boolean crying,int level) {
		this.name = name;
		this.crying = crying;
		this.level = level;
	}

	public void  display() {
		System.out.println("Name : "+this.name);
		System.out.println("Crying is "+this.crying);
		System.out.println("Level is "+this.level);
	}
}
