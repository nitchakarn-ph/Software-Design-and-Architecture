package Decorator;

public class LEDs extends ingredient {
	public LEDs(Tree mytree) {
		this.mytree = mytree;
	}
	public String getDescription() {
		return mytree.getDescription() + ", "
				+ "LEDs";
	}
	public double cost() {
		return 10.00 + mytree.cost();
	}
}
