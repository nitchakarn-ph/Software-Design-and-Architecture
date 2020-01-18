
public class WrapPrinter extends DrawingService {

	private Printer printer;
	
	public WrapPrinter() {
		this.printer = Printer.getPrinter();
	}
	
	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		printer.drawline(x1, x2, y1, y2);

	}

	@Override
	public void drawCircle(int x, int y, int r) {
		printer.drawcircle(x, y, r);

	}

}
