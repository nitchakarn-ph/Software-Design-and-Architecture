package DecoratorPattern;

public class WhiteChocolateDecorator extends DecoratorCake {

	private Cake c;
	private String name;
	
	public WhiteChocolateDecorator(Cake c) {
		this.c = c;
		name = "White chocolate";
	}
	@Override
	public String getText() {
		return this.c.getText() + " + " + name;
	}

	@Override
	public double getcost() {
		return this.c.getcost() + 3;
	}

}
