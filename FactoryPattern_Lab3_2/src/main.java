
public class main {

	public static void main(String[] args) {
		StoreSlot nv = new Nevada();
		Slot slot = nv.orderSlot(slottype.bonus);
		System.out.println("Order is a "+ slot.getName());

	}

}
