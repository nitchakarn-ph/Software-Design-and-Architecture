package Decorator;

public class BallsSilver extends ingredient{
	public BallsSilver(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "BallsSilver";
	}
	public double cost() {
		return 3.00 + mytree.cost();
	}
}
