public class Main {

	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancake = new PancakeHouseMenu();
		Waitess waitess = new Waitess(dinerMenu, null);
		waitess.printMenu();

	}

}
