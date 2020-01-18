package Decorator;

public class testDecorator {
	public static void main(String args[]) {
		Tree myTree = new ColoradoBlueSpruce();
		myTree = new Star(myTree);
		myTree = new Ruffles(myTree);
		myTree = new Star(myTree);
		myTree = new Ruffles(myTree);
		System.out.println(myTree.getDescription() + "\ncosts $" + myTree.cost());
	}
}
