package DecoratorPattern;

public class ChocolateShipDecorator extends DecoratorCake {

	private Cake c;
	private String name;
	
	public ChocolateShipDecorator(Cake c) {
		this.c = c;
		name = "Chocolate ship";
	}
	@Override
	public String getText() {
		
		return this.c.getText() + " + " + name;
	}

	@Override
	public double getcost() {
		return this.c.getcost() + 2;
	}

}
