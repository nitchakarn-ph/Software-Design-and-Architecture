
public class NJProgressiveIngredeint implements SlotIngredientFactory {

	@Override
	public Cabinet createCabinet() {
		// TODO Auto-generated method stub
		return new Small();
	}

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new Bills();
	}

	@Override
	public Display createDisplay() {
		// TODO Auto-generated method stub
		return new CRT();
	}

	@Override
	public GPU createGPU() {
		// TODO Auto-generated method stub
		return new X86();
	}

	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return new WindowsXP();
	}

}
