

public class NJProgress extends Machines{

MachineIngredientFactory IngredientFac;
	
	public NJProgress (MachineIngredientFactory mIngredientFac) {
		this.IngredientFac = mIngredientFac;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing : "+name);
		straight = IngredientFac.createStraight();
		bonus = IngredientFac.createBonus();
		progress = IngredientFac.createProgress();
		
	}
}
