package lab4;

public class KhonkeanPizzaStore extends PizzaStore{

	@Override
	public Pizzas createPizza(String item) {
		
		Pizzas pizza = null;
		if(item.equalsIgnoreCase("cheese")) {
			pizza = new KhonkeanCheesePizza();
		}
		return pizza;
	}

	
}
