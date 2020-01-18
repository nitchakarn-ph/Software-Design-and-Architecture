
public class Sword implements WeaponBehavior {

	private String name;
	
	public Sword() {
		name = "sword";
	}
	@Override
	public void useWeapon() {
		System.out.println("I can use my "+ name + ".");

	}

}
