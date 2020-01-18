
public class Whip extends CondimentDecorator{
	
	protected Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.10;
	}

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescripting()+ "Whip";
	}
	
}
