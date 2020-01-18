package pizza;

import java.util.ArrayList;

public abstract class Pizza {

	protected String name;
	private String dough;
	private String sauce;
	private ArrayList<String> topppings;
	
	
	public Pizza() {
		
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getSauce() {
		return this.sauce;
	}
	public void prepare() {
		System.out.print("preparing\n");
	}
	
	public void bake() {
		System.out.print("baking\n");
	}
	
	public void cut() {
		System.out.print("cutting pizza\n");
	}
	
	public void box() {
		System.out.print("packing box\n");
	}
	
	public String toString() {
		return this.sauce + this.name;
	}
}
