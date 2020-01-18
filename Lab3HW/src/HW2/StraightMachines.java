package HW2;

public class StraightMachines extends Machines{

	protected MachinesIngredentFactory factory;
	
	public StraightMachines(MachinesIngredentFactory factory) {
		this.factory = factory;
		
		this.prepare();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
