package Decorator;

public abstract class ingredient  extends Tree{
	public Tree mytree;
	public abstract String getDescription();
	public abstract double cost();
	public void setStar() {
		mytree.setStar();
	}
	public boolean hasStar() {
		return mytree.hasStar();

	}
}
