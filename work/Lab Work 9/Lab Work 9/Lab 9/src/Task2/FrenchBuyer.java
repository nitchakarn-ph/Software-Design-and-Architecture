package Task2;

public class FrenchBuyer extends Buyer {
	public FrenchBuyer(Mediator mediator) {
		super(mediator, "EURO");
		this.mediator.registerFrenchBuyer(this);
	}
}
