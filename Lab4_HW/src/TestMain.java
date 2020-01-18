

public class TestMain {
	public static void main (String[] arg) {
		MachineStore nvstore = new NewJMachineStore();
		MachineStore njstore = new NVMachineStore();
		MachineStore wtstore = new WashingtonMachineStore();
		
		Machines m = nvstore.orderMachine("Straight");
		System.out.println(m.getName());
		
		m = njstore.orderMachine("Straight");
		System.out.println(m.getName());
		
		m = wtstore.orderMachine("Straight");
		System.out.println(m.getName());
	}
}
