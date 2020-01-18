
public class NVStraightIngredient implements SlotIngredientFactory {

	@Override
	public Cabinet createCabinet() {
		// TODO Auto-generated method stub
		return new Large();
	}

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new TickeTintickeOut();
	}

	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new Reels();
	}

	@Override
	public GPU createGPU() {
		// TODO Auto-generated method stub
		return new ARM();
	}

	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return new Linux();
	}

}
