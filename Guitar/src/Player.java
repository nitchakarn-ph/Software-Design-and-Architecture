import java.util.ArrayList;

public class Player implements SoloAct {
	
	private ArrayList observers;
	private String name;
	
	private String gtname;
	private String action;
	
	public Player(String name) {
		this.name = name;
		observers=new ArrayList();
	}
	
	public void setData(String gtname, String action) {
		this.gtname = gtname;
		this.action = action;
		notifyObservers();
	}
	
	public void notifyObservers() {
		for (int i=0; i< observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(name, gtname, action);
		}
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >=0) {
			observers.remove(i);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
}
