package Decorator;

public class BallsRed extends ingredient{
	public BallsRed(Tree mytree){
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "BallsRed";
	}
	public double cost() {
		return 1.00 + mytree.cost();
	}
}
