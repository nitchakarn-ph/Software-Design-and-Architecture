

public class NewJMachineStore extends MachineStore{

	@Override
	public Machines createMachine(String item) {
		Machines machines = null;
		if(item.equalsIgnoreCase("Straight")) {
			machines = new NJStraight();
		}else if(item.equalsIgnoreCase("Bonus")) {
			machines = new NJBonus();
		}else if(item.equalsIgnoreCase("Progressive")) {
			machines = new NJProgress();
		}
		
		return machines;
	}

	
}
