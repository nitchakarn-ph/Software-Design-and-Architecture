
public class Soy extends CondimentDecorator{


	protected Beverage beverage;

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.15;
	}

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescripting();
	}
	
}
