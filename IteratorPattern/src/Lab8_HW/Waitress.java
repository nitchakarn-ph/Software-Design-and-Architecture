package Lab8_HW;

public class Waitress {

	private LBreakfast breakfast ;
	private MDinner dinner;
	
	public Waitress(LBreakfast breakfast,MDinner dinner) {
		this.breakfast = breakfast;
		this.dinner = dinner;
	}
	
	public void printMenu() {
		Iterator dinerIterator = dinner.createIterator();
		System.out.println("Menu\n");
		System.out.println("\nDinner");
		printMenu(dinerIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			
		}
	}
}
