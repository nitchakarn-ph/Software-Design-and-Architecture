import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String [] arg) {
		
		List<Shape> shape = new LinkedList<Shape>();
		shape.add(new Rectangle(10,10,100,100));
		shape.add(new Rectangle(110,110,200,200));
		shape.add(new Circle(250,250,30));
		
	
		
		
		for(Shape s : shape) {
			//s.setDrawingService(new WrapMonitor());
			s.setDrawingService(new WrapPrinter());
		}
		
		for(Shape s :shape) {
			s.draw();
		}
		
	}
}
