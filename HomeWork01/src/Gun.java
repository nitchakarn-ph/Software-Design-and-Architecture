
public class Gun implements WeaponBehavior {

	private String name;
	
	public Gun() {
		name = "gun";
	}
	
	@Override
	public void useWeapon() {
		System.out.println("I can use my "+name+".");

	}

}
