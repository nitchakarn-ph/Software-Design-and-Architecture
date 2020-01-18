package lab4;

public class BangkokPizzaStore extends PizzaStore {

	@Override
	public Pizzas createPizza(String item) {
		Pizzas pizza = null;
		
		if(item.equalsIgnoreCase("cheese")) {
			pizza = new BangkokCheesePizza();
		}
		return pizza;
	}

}
