package pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChessesPizza();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}else {
			System.out.println("This is no such menu,please select menu again.");
		}
			
		
		return pizza;
		
		
		
	}
}
