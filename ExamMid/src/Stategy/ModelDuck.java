package Stategy;

public class ModelDuck extends Duck{

	public ModelDuck() {
		fly = new FlyNoWay();
		quack = new Quack();
	}
	
	public void display() {
		System.out.println("This is modal duck.");
	}

}
