package FactoryMethod;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		
		if(type.equalsIgnoreCase("cheese")) {
			return new NYCheesePizza();
		}else if(type.equalsIgnoreCase("pepperoni")) {
			return new NYPepperoni();
		}else if(type.equalsIgnoreCase("greek")) {
			return new NYGreekPizza();
		}else{
			return null;
		}
	}

}
