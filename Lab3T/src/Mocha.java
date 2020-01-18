
public class Mocha extends CondimentDecorator{
	
	protected Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+0.20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescripting()+ "Mocha";
	}
	
}
