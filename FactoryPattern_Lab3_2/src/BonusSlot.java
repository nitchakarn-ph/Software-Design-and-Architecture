
public class BonusSlot extends Slot{

	private SlotIngredientFactory slotInFac;
	
	public BonusSlot(SlotIngredientFactory slotInFac) {
		this.slotInFac = slotInFac;
	}

	@Override
	public void componets() {
		System.out.println(name);
		cabinet = slotInFac.createCabinet();
		payment = slotInFac.createPayment();
		display = slotInFac.createDisplay();
		gpu = slotInFac.createGPU();
		os = slotInFac.createOS();
		
		
	}
	
	
}
