
public class Knight extends Character {

	private String name;
	
	public Knight() {
		name = "Knight";
		
	}
	@Override
	public void fight() {
		System.out.print("I'm a "+ name + " and ");
		weaponBehavior.useWeapon();
		
	}

	

}
