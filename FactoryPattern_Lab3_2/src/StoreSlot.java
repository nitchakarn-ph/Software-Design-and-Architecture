
public abstract class StoreSlot {

	public Slot orderSlot(slottype type) {
		Slot slot;
		slot = makeSlot(type);
		slot.componets();
		return slot;
		}
		protected abstract Slot makeSlot(slottype type); 
}
