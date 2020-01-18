
public class Main {

	public static void main(String[] args) {
		
		Player p1 = new Player("Test");
		
		Charactor c1 = new Charactor("Slash", p1);
		
		p1.setData("Gibson Les Paul", "Smash the guitar.");
		
		Charactor c2 = new Charactor("Jimi", p1);
		
		p1.setData("Fender Telecaster", "Guitar on Fire.");
		
		
		
	}

}
