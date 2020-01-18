package Factory;

public class NJSlotStore extends SlotStore {

	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.progressive)) { 
			tmp = new NJSlotProgressive();
		}
		else if (type.equals(slottype.straight)) { 
			tmp = new NJSlotStraight();
		}
		else if (type.equals(slottype.bonus)) { 
			tmp = new NJSlotBonus();
		}
		
		return tmp;
	}
}
