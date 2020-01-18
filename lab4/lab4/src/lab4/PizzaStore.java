package lab4;

public abstract class PizzaStore {
	
	public abstract Pizzas createPizza(String item);

	public Pizzas orderPizza(String type) {
		Pizzas pizza = null;
		
		if(type.equalsIgnoreCase("cheese")) {
			pizza = createPizza("cheese"); 
		}else if(type.equalsIgnoreCase("cheese")) {
			pizza = createPizza("cheese"); 
		}
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		return pizza;
	}
	
	
}
