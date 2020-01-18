package FactoryMethod;

import java.util.ArrayList;

public abstract class Pizza {

	protected String name = "";
	protected String dough;
	protected String sauce;
	protected ArrayList topping = new ArrayList();
	

	public void prepare() {
		System.out.println("prepare... "+name);
		System.out.println("Tossing dough....");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping...");
		for(int i=0;i<topping.size();i++) {
			System.out.println(" "+ topping.get(i));
		}
	}
	
	public void bake() {
		System.out.println("baking...");
	}
	
	public void cut() {
		System.out.println("cutting...");
	}
	
	public void box() {
		System.out.println("boxing...");
	}
	
	public String getName() {
		return name;
	}
}
