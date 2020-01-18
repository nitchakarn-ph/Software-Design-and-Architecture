package pizza;

import java.util.ArrayList;

public abstract class Pizza {

	private String name;
	private String dough;
	private String sauce;
	private ArrayList<String> topppings;
	
	
	public Pizza() {
		
	}

	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.print("preparing");
	}
	
	public void bake() {
		System.out.print("baking");
	}
	
	public void cut() {
		System.out.print("cutting pizza");
	}
	
	public void box() {
		System.out.print("packing box");
	}
	
	public String toString() {
		return null;
	}
}
