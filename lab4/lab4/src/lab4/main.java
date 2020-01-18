package lab4;

public class main {
	public static void main(String[] arg) {
	
		PizzaStore kkStore = new KhonkeanPizzaStore();
		
		Pizzas pizza = kkStore.orderPizza("cheese");
		System.out.println("order .. " + pizza.getName());
	
	}
}
