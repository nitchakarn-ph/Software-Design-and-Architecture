package Decorator;

public class BallsBlue extends ingredient{
	public BallsBlue(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription();
	}
	public double cost() {
		return 2.00 + mytree.cost();
	}
}
