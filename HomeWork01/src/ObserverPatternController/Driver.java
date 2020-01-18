package ObserverPatternController;

public interface Driver {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
