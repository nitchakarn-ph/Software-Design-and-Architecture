package ObserverPattern;

import java.util.ArrayList;
import java.util.Random;

public class Dealer implements IDealer {

	private ArrayList observers;
	private int number;
	private Random ramdomNumber;
	
	public Dealer() {
		observers = new ArrayList();
		ramdomNumber = new Random();
	}
	
	public int doLotteryResult() {
		number = ramdomNumber.nextInt(10);
		return number;
	}
	
	@Override
	public void addMember(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeMember(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(number);
		}

	}

}
