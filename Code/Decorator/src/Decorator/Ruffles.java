package Decorator;

public class Ruffles extends ingredient{
	public Ruffles(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "Ruffles";
	}
	public double cost() {
		return 1.00 + mytree.cost();
	}
}
