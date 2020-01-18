
public class LEDs extends Component{

	protected Tree trees;
	
	public LEDs(Tree nameT) {
		trees = nameT;
	}
	@Override
	public String getNameTree() {
		// TODO Auto-generated method stub
		return this.trees.getNameTree();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.trees.cost()+10.00;
	}

}
