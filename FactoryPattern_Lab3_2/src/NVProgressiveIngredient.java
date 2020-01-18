
public class NVProgressiveIngredient implements SlotIngredientFactory {

	@Override
	public Cabinet createCabinet() {
		// TODO Auto-generated method stub
		return new Medium();
	}

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new TickeTintickeOut();
	}

	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new LCD();
	}

	@Override
	public GPU createGPU() {
		// TODO Auto-generated method stub
		return new X77();
	}

	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return new Android();
	}

}
