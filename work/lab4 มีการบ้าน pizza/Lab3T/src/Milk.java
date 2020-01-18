
public class Milk extends CondimentDecorator{

	protected Beverage beverage;
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescripting();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.10;
	}

	
}
