
public class King extends Character {

	
	private String nameCharacter;
	
	public King() {
		nameCharacter = "King";
	}

	@Override
	public void fight() {
		System.out.print("I'm a "+ nameCharacter + " and ");
		weaponBehavior.useWeapon();
		
	}
	

}
