
public class Queen extends Character {

	private String name;
	
	public Queen () {
		name = "queen";
	}
	
	@Override
	public void fight() {
		System.out.print("I'm a " + name + " and ");
		weaponBehavior.useWeapon();
	}

	

}
