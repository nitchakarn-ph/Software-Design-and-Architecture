
public class Main {

	public static void main(String[] args) {
		 /*Baby b = new Baby("Paw");
		 b.setData(true, 10);
		 Baby c = new Baby("Mee");
		 
		 //Observer o  = new BabyMonitorSimple("Home",b);
		 
		 b.registerObserver(new BabyMonitorSimple("Home",b));
		 b.registerObserver(new BabyMonitorAdvanced("Home",b,c));*/
		
		Baby marla = new Baby("marla");
		// one monitor with one baby
		BabyMonitorSimple livingRoom = new BabyMonitorSimple("kitchen ", marla);
		marla.setData(true, 1);
		
		livingRoom.display();
		
		/*// one monitor listening to two babies
		Baby charlie = new Baby("Charlie");
		BabyMonitorAdvanced kitchen = new BabyMonitorAdvanced("Living room ", marla, charlie);
		marla.setData(true, 2);
		charlie.setData(true,1);*/
		 
	}

}
