package DecoratorPattern;

public class MainTestCake {

	public static void main (String[] args) {
		Cake c = new CupCake();
		DecoratorCake d = new SmallCandiesDecorator(c);
		DecoratorCake s = new ChocolateShipDecorator(d);
		DecoratorCake w = new WhiteChocolateDecorator(s);
		System.out.println("Name : " + w.getText() + " Price: "+ w.getcost());
	
		Cake butterCake = new ButterCake();
		DecoratorCake chocoButter = new SmallCandiesDecorator(butterCake);
		DecoratorCake butterShip = new ChocolateShipDecorator(chocoButter);
		System.out.println("Name :"+ butterShip.getText()+ " Price:"+ butterShip.getcost());

	
	}
}
