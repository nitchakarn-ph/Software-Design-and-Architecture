package AbstractFactory;

//import jdk.tools.jlink.internal.Platform;

public class main {

	public static void main(String[] arg) {
		
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		
		//check what platform we,re on
		/*if(Platform.currentPlaform()=="MACOSX") {
			widgetFactory = (AbstractWidgetFactory) new MacOSXWindowFactory();
		}*/
	}
}
