package HW2;

public class Nevada implements MachinesIngredentFactory{

	public Nevada() {
		
	}
	@Override
	public Cabinet createCabinet() {
		// TODO Auto-generated method stub
		return new Ticketinticketout();
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
