package DecoratorPattern;

public class ButterCake extends Cake {

	public String name;
	
	public ButterCake() {
		name = "Butter cake";
	}
	
	public String getText() {
		return name;
	}
	
	@Override
	public double getcost() {
		return 20;
	}

}
