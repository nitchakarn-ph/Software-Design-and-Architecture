
public class Knife implements WeaponBehavior {

	private String name;
	public Knife() {
		name = "knife";
	}
	@Override
	public void useWeapon() {
		System.out.println("I can use my "+name+".");
	}
	
	

}
