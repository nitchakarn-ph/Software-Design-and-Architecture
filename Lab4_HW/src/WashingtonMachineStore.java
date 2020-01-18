

public class WashingtonMachineStore extends MachineStore{

	@Override
	public Machines createMachine(String item) {
		Machines machines = null;
		if(item.equalsIgnoreCase("Straight")) {
			machines = new WTStraight();
		}else if(item.equalsIgnoreCase("Bonus")) {
			machines = new WTBonus();
		}else if(item.equalsIgnoreCase("Progressive")) {
			machines = new WTProgress();
		}
		return machines;
	}

}
