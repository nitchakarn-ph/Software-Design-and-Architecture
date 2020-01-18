package lab4;

public class KhonkaenPizzaIngredientFactory implements PizzaIngredientFactory{

	public Cheese createCheese(String type) {
		Cheese cheese = null;
		
		if(type.equalsIgnoreCase("Mozzala")) {
			cheese = new MozzalaCheese();
		}
		
		return cheese;
	}
}
