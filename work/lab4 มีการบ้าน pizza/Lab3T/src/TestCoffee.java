
public class TestCoffee {

	public static void main(String[] args) {
	Beverage beverage ;
	
	beverage = new Whip(new Mocha(new DarkRost()));

	System.out.println(beverage.cost());
	
	}

}
