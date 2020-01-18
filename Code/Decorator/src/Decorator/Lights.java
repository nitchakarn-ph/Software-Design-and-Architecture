package Decorator;

public class Lights extends ingredient{
	public Lights(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "Lights";
	}
	public double cost() {
		return 5.00 + mytree.cost();
	}
}
