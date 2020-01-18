
public class NVBonusIngredient implements SlotIngredientFactory{

	@Override
	public Cabinet createCabinet() {
		return new Small();
	}

	@Override
	public Payment createPayment() {
		return new TickeTintickeOut();
	}

	@Override
	public Display createDisplay() {
		return new CRT();
	}

	@Override
	public GPU createGPU() {
		return new X86();
	}

	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return new Linux();
	}

	

}
