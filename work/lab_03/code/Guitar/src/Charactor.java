
public class Charactor implements Observer {
	
	private SoloAct mdata;
	private String cname;
	private String action;

	public Charactor(String cname, Player p) {
		this.mdata=p;
		this.cname=cname;
		mdata.registerObserver(this);
	}
	
	public void turnOff() {
		mdata.removeObserver(this);
	}
	
	@Override
	public void update(String cname, String gtname,String action) {
		this.action = action;
		display();
	}
	
	public void display() {
		System.out.println("Charactor:" + cname + " " + action);
	}

}
