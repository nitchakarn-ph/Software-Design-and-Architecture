package lab4;

public class SimplePizzaFactory {

	public Pizzas createPizza(String type) {
		Pizzas pizza = null; //���������� ������ҵ�ͧ�ա�� return pizza 
		if(type.equalsIgnoreCase("cheese")) {
			pizza = new Chesses();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}
		
		return pizza;
	}
}
