package AbstractFactory;
//concreteFactory2
public class MacOSXWindowFactory {

	//create MacOSXWindow
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}
}
