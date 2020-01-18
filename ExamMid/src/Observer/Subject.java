package Observer;

public interface Subject {
	public void registerObserver(Observer o); //���� observer
	public void removeObserver(Observer o); //ź observer
	public void notifyObserver(); //����͹ observer
}
