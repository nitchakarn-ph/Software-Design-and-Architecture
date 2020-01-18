
public class Main {

	public static void main(String[] args) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		
		
		System.out.println(mytree.getNameTree());
		System.out.println(mytree.cost());
		
		/*String star = "star";
		
		if(star.contains("starf")) {
			System.out.println("true");
		}*/
		

	}

}
