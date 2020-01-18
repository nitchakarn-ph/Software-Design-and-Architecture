package HW2;

public class BonusMachines extends Machines{

	protected MachinesIngredentFactory factory;
	
	public BonusMachines (MachinesIngredentFactory factory) {
		this.factory = factory;
		
		this.prepare();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
