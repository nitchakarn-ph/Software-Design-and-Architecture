package Observer;

public interface Subject {
	public void registerObserver(Observer o); //เพิ่ม observer
	public void removeObserver(Observer o); //ลบ observer
	public void notifyObserver(); //แจ้งเตือน observer
}
