
public class Star extends Component{

	protected Tree trees;
	
	public Star (Tree treeNames) {
		if(treeNames.getNameTree().contains("Star")) {
			System.out.println("Tree already has a star!");
			trees = treeNames;
		}else {
			trees = treeNames;
		}
		
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(trees.getNameTree().contains("Star")) {
			return this.trees.cost();
		}else {
			return this.trees.cost() + 4.0;
		}
	}
	
	@Override
	public String getNameTree() {
		// TODO Auto-generated method stub
		
		if(trees.getNameTree().contains("Star")) {
			return trees.getNameTree();
		}else {
			return trees.getNameTree() + "Star ,";
		}
	}

	
}
