package Lab8_HW;

import java.util.ArrayList;

public class LBreakfast {
	ArrayList menuItems;
	
	public LBreakfast() {
		menuItems = new ArrayList();
		
		addItem("Lou’s pancake breakfast ", "Pancake with scrambled eggs, and toast", true, 2.99);
		
		addItem("Blueberry Pancakes","Pancakes made with fresh buleberries",true,3.49);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		this.menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItem() {
		return this.menuItems;
	}
}
