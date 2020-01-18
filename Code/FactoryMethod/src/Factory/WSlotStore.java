package Factory;

public class WSlotStore extends SlotStore {
	
	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.progressive)) {
		tmp = new WSlotProgressive();
		}
		else if (type.equals(slottype.straight)) { 
			tmp = new WSlotStraight();
		}
		else if (type.equals(slottype.bonus)) { 
			tmp = new WSlotBonus();
		}
		return tmp;
	}
}