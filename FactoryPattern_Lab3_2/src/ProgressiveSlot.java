
public class ProgressiveSlot extends Slot{

	private SlotIngredientFactory slotInFac;
	
	public ProgressiveSlot(SlotIngredientFactory slotInFac) {
		this.slotInFac = slotInFac;
	}
	@Override
	void componets() {
		System.out.println(name);
		cabinet = slotInFac.createCabinet();
		payment = slotInFac.createPayment();
		display = slotInFac.createDisplay();
		gpu = slotInFac.createGPU();
		os = slotInFac.createOS();
		
	}
}
