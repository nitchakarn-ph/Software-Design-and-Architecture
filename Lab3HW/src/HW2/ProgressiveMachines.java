package HW2;

public class ProgressiveMachines extends Machines{

	protected MachinesIngredentFactory factory;
	
	public ProgressiveMachines(MachinesIngredentFactory factory) {
		this.factory = factory;
		
		this.prepare();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
