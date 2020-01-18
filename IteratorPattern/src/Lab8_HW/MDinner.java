package Lab8_HW;

public class MDinner {

	private static final int MAX_ITEMS = 6;
	private int numberOfItem = 0;
	MenuItem[] menuItems;
	
	public MDinner() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT","Bacon with lettuce & tomato on whole wheat",true,2.99);
		
		addItem("BLT","Becon with lettuce & tomato on whole wheat",false,2.99);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		
		if(numberOfItem >= MAX_ITEMS) {
			System.err.println("Sorry , menu is full ! Can't add item to menu");
		}else {
			menuItems[numberOfItem] = menuItem;
			numberOfItem = numberOfItem+1;
		}
	}
	
	/*public MenuItem[] getMenuItems() {
		return this.menuItems;
	}*/
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}


}
