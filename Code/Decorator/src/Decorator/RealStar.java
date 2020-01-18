package Decorator;

public class RealStar extends ingredient {
	
	public RealStar(Tree t) {
			this.mytree=t; 
	}
	
	public String getDescription() {
		return mytree.getDescription() + ", a Star";
	}

	public double cost() {
		return   4.00 + mytree.cost();
    }

}

