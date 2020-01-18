package FactoryMethod;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {		
		if(type.equalsIgnoreCase("cheese")) {
			return new CGCheesePizza();
		}else if(type.equalsIgnoreCase("pepperoni")) {
			return new CGPepperoni();
		}else if(type.equalsIgnoreCase("greek")) {
			return new CGGreekPizza();
		}else {
			return null;
		}
		
		
	}

}
