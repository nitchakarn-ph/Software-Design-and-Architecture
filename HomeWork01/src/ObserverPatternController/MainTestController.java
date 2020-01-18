package ObserverPatternController;

public class MainTestController {

	public static void main(String[] args) {
		Controller control = new Controller();
		PrinterDriver print = new PrinterDriver(control);
		control.setNameDriver("printer");
		
		Controller control2 = new Controller();
		MonitorDriver monitor = new MonitorDriver(control2);
		control2.setNameDriver("monitor");

	}

}
