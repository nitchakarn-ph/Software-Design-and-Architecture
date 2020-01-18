
public class NJStraightIngredient implements SlotIngredientFactory {

	@Override
	public Cabinet createCabinet() {
		// TODO Auto-generated method stub
		return new Small();
	}

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new Coins();
	}

	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new LCD();
	}

	@Override
	public GPU createGPU() {
		// TODO Auto-generated method stub
		return new ARM();
	}

	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return new WindowsME();
	}

}
