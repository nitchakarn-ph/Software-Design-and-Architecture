package lab4;

public abstract class Pizzas {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public abstract String toString();
	
	public void prepare() {
		System.out.println("preparing");
	}
	public void bake() {
		System.out.println("baking");
	}
	public void cut() {
		System.out.println("cutting");
	}
	public void box() {
		System.out.println("packing box");
	}
}
