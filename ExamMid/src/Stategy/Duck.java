package Stategy;

public abstract class Duck {
	FlyBehavior fly ;
	QuackBehavior quack;
	
	public void performFly() {
		fly.fly(); //call method fly of FlyBehavior
		
	}
	
	public void performQuack() {
		quack.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fly) {
		this.fly = fly;
	}
	
	public void setQuackBehavior(QuackBehavior quack) {
		this.quack = quack;
	}
}
