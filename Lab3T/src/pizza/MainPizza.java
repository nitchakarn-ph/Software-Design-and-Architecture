package pizza;

public class MainPizza {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store =  new PizzaStore(factory);
		
		Pizza pizza = factory.createPizza("cheese");
		System.out.println(" ' "+pizza.name+" ' ");
		pizza = store.OrderPizza("cheese");
		
		
		
		
		
	}

}
