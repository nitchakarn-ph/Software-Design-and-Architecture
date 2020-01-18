package Factory;

public class NVSlotStore extends SlotStore {
	
	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.progressive)) {
		tmp = new NVSlotProgressive();
		}
		else if (type.equals(slottype.straight)) { 
			tmp = new NVSlotStraight();
		}
		else if (type.equals(slottype.bonus)) { 
			tmp = new NVSlotBonus();
		}
		return tmp;
	}
}