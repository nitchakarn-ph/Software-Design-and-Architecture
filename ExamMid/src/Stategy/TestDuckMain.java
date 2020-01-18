package Stategy;

public class TestDuckMain {

	public static void main(String[] args) {
		Duck mallarDuck = new MallarDuck();
		mallarDuck.performFly();
		mallarDuck.performQuack();
		
		Duck modal = new ModelDuck();
		modal.performFly();
		modal.setFlyBehavior(new FlyRocketPowered());
		modal.performFly();
		
	}

}
