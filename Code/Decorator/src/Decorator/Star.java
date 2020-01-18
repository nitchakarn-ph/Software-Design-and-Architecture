package Decorator;

public class Star extends ingredient {
	
	public Star(Tree mytree) {
		if (!mytree.hasStar()) {   
			mytree.setStar();
			 this.mytree=new RealStar(mytree);
		}
		else { 
			System.out.println("Tree already has a star!");
			this.mytree=mytree;
		}
	}
	
	public String getDescription() {
		return mytree.getDescription();
	}

	public double cost() {
		return mytree.cost();
    }

}