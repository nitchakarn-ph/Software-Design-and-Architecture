package ObserverPattern;

public interface IDealer {

	public void addMember(Observer o);
	public void removeMember(Observer o);
	public void notifyObserver();
	
}
