import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	//object ผู้ดูแล มีหน้าที่ในการคืนค่าสถานะของ object
	
	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
