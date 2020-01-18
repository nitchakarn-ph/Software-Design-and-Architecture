package Decorator;

public class Ribbons extends ingredient {
	public Ribbons(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "Ribbons";
	}
	public double cost() {
		return 2.00 + mytree.cost();
	}
}
