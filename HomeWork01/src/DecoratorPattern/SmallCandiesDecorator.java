package DecoratorPattern;

public class SmallCandiesDecorator extends DecoratorCake {

	private String name;
	private Cake c;
	
	public SmallCandiesDecorator(Cake c) {
		name = "Small candies";
		this.c = c;
	}
	
	@Override
	public String getText() {
		return this.c.getText() + " + " + name;
	}

	@Override
	public double getcost() {
		return this.c.getcost() + 1;
	}

}
