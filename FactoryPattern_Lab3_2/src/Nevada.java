
public class Nevada extends StoreSlot{

	@Override
	protected Slot makeSlot(slottype type) {
		Slot slot = null;
		SlotIngredientFactory ingredient = new NVBonusIngredient();
		if(type.equals(slottype.bonus)) {
			slot = new BonusSlot(ingredient);
			slot.setName("Neveda Bonus");
		}
		
		
		return slot;
	}

}
