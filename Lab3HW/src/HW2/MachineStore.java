package HW2;

public abstract class MachineStore {

	public abstract Machines createMachine(String item);

	public Machines orderMachines(String type) {
		Machines machines = null;
		if(type.equalsIgnoreCase("straight")) {
			machines = createMachine("Straight");
		}else if(type.equalsIgnoreCase("Bonus")) {
			machines = createMachine("Bonus");
		}else if(type.equalsIgnoreCase("progressive")) {
			machines = createMachine("progressive");
		}else {
			System.out.println("error");
		}
		
		machines.prepare();
		
		return machines;
	}
}
