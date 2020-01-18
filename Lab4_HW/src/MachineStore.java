

public abstract class MachineStore extends Machines{

	public abstract Machines createMachine(String item);
	
	public Machines orderMachine(String type) {
		
		Machines machine = null;
		machine = createMachine(type);
		
		machine.prepare();
		
		return machine;
	}
}
