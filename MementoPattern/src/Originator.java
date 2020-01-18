
public class Originator {
	//���ҧ��ШѴ�� state 
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMomento(Memento memento) {
		state = memento.getState();
	}
}
