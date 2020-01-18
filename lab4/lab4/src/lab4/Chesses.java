package lab4;

public class Chesses extends Pizzas {

	private PizzaIngredientFactory ingredientFactory;
	
	public Chesses() {
		this.setName("cheese");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		Cheese cheese = ingredientFactory.createCheese("Mozzala");
		System.out.println("preparing "+ cheese.toString());
	}
	
	
	
}
