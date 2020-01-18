
public class DependentMachineStore {
	
	public Machines createMachine(String style,String type) {
		Machines machines = null;
		if(style.equals("NJ")) {
			if(type.equalsIgnoreCase("straight")) {
				machines = new NJStraight();
			}else if(type.equalsIgnoreCase("progress")) {
				machines = new NJProgress();
			}else if(type.equalsIgnoreCase("bonus")) {
				machines = new NJBonus();
			}
			
		}else if(style.equalsIgnoreCase("NV")) {
			if(type.equalsIgnoreCase("straight")) {
				machines = new NvStraight();
			}else if(type.equalsIgnoreCase("progress")) {
				machines = new NvProgess();
			}else if(type.equalsIgnoreCase("bonus")) {
				machines = new NvBonus();
			}
		}else if(style.equalsIgnoreCase("WT")) {
			if(type.equalsIgnoreCase("straight")) {
				machines = new WTStraight();
			}else if(type.equalsIgnoreCase("progress")) {
				machines = new WTProgress();
			}else if(type.equalsIgnoreCase("bonus")) {
				machines = new WTBonus();
			}
		}else {
			System.out.println("Error : invalid type of machine");
			return null;
		}
		
		machines.prepare();
		machines.upload();
		
		return machines;
	}
}
