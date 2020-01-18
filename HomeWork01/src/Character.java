
public abstract class Character {

	protected WeaponBehavior weaponBehavior;
	
	public void setWeapon(WeaponBehavior weapon) {
		
		this.weaponBehavior = weapon;
		
	};
	public abstract void fight() ;
}
