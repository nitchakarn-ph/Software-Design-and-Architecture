package DecoratorPattern;

public class CupCake extends Cake {

	public CupCake() {
		nameCake = "CupCake";
	}
	
	public String getText() {
		return nameCake; // กำลังลักษณะของ cake ที่มีชื่อว่า cup cake 
	}
	
	@Override
	public double getcost() {
		return 15;
	}

}
