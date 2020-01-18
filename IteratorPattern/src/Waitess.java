

public class Waitess {
	
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitess(DinerMenu dinerManu,PancakeHouseMenu pancakeHouseMenu) {
		this.dinerMenu = dinerManu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu() {
		Iterator dinerMenuIterator = dinerMenu.createIterator();
		printMenu(dinerMenuIterator);
	}
	
	
	public void printMenu(Iterator interator) {
		while (interator.hasNext()) {
			MenuItem item = (MenuItem)interator.next();
			System.out.println(item.getName());
			System.out.println(item.getPrice());
		}
	}
}
