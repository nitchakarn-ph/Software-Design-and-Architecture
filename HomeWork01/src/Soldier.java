
public class Soldier extends Character{

	private String name ;
	
	public Soldier() {
		name = "soldier";
	}
	
	@Override
	public void fight() {
		System.out.print("I'm a "+ name + " and ");
		weaponBehavior.useWeapon();
		
	}

}
