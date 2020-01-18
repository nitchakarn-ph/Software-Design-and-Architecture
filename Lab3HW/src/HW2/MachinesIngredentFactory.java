package HW2;

public interface MachinesIngredentFactory {
	
	public Cabinet createCabinet() ;
	public Display createDisplay();
	public GPU	createGPU();
	public OS	createOS();
	
}
