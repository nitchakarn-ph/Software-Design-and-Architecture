package Factory;

public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WStore = new WSlotStore();
		Slot slot = NVStore.orderSlot(slottype.progressive);
		System.out.println("Ordered a "+ slot.getName());
		slot = NJStore.orderSlot(slottype.straight);
		System.out.println("Ordered a "+ slot.getName());	
		slot = WStore.orderSlot(slottype.bonus);
		System.out.println("Ordered a "+ slot.getName());
		
	}

}
