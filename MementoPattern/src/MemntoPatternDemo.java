
public class MemntoPatternDemo {
	//�� 2 object ��� careTaker and Originator
	
	public static void main (String [] arg) {
	
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
	
		originator.setState("Sate #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
	
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		
		//ʶҹлѨ�غѹ
		originator.setState("State #4");
		System.out.println("Current State : "+originator.getState());
		
		
		originator.getStateFromMomento(careTaker.get(0));
		System.out.println("Fist saved State: "+originator.getState());
		originator.getStateFromMomento(careTaker.get(1));
		System.out.println("Secound saved State: "+originator.getState());
	
	
	}
	
}
