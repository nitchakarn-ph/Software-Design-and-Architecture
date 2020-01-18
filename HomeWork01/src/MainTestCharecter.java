
public class MainTestCharecter {

	public static void main (String [] args) {
		Character k = new King();
		Character q = new Queen();
		Character knight = new Knight();
		k.setWeapon(new Sword());
		q.setWeapon(new Knife());
		knight.setWeapon(new Sword());
		k.fight();
		q.fight();
		knight.fight();
		
		Character s = new Soldier();
		s.setWeapon(new Gun());
		s.fight();
		
	}
}
