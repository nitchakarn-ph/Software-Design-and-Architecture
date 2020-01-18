
public class NJMachinesIngredientFac implements MachineIngredientFactory{

	@Override
	public Straight [] createStraight() {
		Straight s[] = { new Small(),new Coins(),new LCD(),new ARM(),new WindowsME()};
		
		return s;
	}

	@Override
	public Bonus [] createBonus() {
		Bouus b[] = {new Large(),new Coins(),new Reels(),new ARM(),new WindowsME()};
		return b;
	}

	@Override
	public Progress [] createProgress() {
		Progress p[] = {new Small(),new Bills(),new CRT(),new X86(),new WindowsXP()};
		return p;
	}

}
