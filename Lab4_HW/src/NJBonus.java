

public class NJBonus extends Machines{

	MachineIngredientFactory IngredientFac;
	
	public NJBonus(MachineIngredientFactory mIngredientFac) {
		this.IngredientFac = mIngredientFac;
	}
	public void prepare() {
		System.out.println("Preparing : "+name);
		straight = IngredientFac.createStraight();
		bonus = IngredientFac.createBonus();
		progress = IngredientFac.createProgress();
		
	}

}
