package Task1;

public class Main {

	public static void main(String[] args) {
		DrawingService display = new WrapScreen();
		DrawingService print = new WrapPrinter();
		
		Shape r1 = new Rectangle(1,2,3,4,display);
		Shape r2 = new Rectangle(5,6,7,8,print);
		
		Shape c1 = new Circle(2,2,0,display);
		Shape c2 = new Circle(1,1,1,print);
		
		Shape p1 = new Polygon(1,1,2,2,display);
		Shape p2 = new Polygon(2,2,4,4,print);
		
		r1.draw();
		r2.draw();
		c1.draw();
		c2.draw();
		p1.draw();
		p2.draw();
		
	}

}
