
public class Ruffles extends Component {

	protected Tree trees;
	
	
	public Ruffles(Tree nameT) {
		trees = nameT;
	}
	@Override
	public String getNameTree() {
		// TODO Auto-generated method stub
		return this.trees.getNameTree() + "Ruffles ,";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.trees.cost()+1.00;
	}

}
