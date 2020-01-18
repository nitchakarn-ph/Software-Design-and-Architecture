package FactoryMethod;

public class Pizza_Main_Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " +pizza.getName() + "\n");

	}

}
