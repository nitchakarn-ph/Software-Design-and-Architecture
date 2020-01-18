package HW3_2;

public class NVMachineStore extends MachineStore{

	@Override
	public Machines createMachine(String item) {
		Machines machines = null;
		
		if(item.equalsIgnoreCase("Straight")) {
			machines = new NvStraight();
		}else if(item.equalsIgnoreCase("Bonus")) {
			machines = new NvBonus();
		}else if(item.equalsIgnoreCase("Progressive")) {
			machines = new NvProgess();
		}
		return machines ;
	}

}
