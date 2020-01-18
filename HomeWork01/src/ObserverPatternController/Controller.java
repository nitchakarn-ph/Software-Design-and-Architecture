package ObserverPatternController;

import java.util.ArrayList;

public class Controller implements Driver {

	private ArrayList observers;
	private String nameDriver;
	
	public Controller () {
		observers = new ArrayList();
		
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		for(int i =0 ;i<observers.size();i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(nameDriver);
		}

	}
	
	public void setNameDriver(String name) {
		this.nameDriver = name;
		notifyObserver();
	}

}
