package task_2;

import java.util.Iterator;

public class Cube implements Prim  {
    
	private float width;
	private float height;
	private float depth;
	
	public Cube(float f, float g, float h){
		this.width = f;
		this.height = g;
		this.depth = h;
	}
	
	public void render() {
		System.out.println("Cube W: "+ width + " H: " + height + " D: " + depth);
	}
	
	public float volume() {
		return width * height * depth;
	}
	
	public Iterator createIterator() {
		return new NullIterator();
	}

	@Override
	public void add(Prim graphic) {
	
	}

	@Override
	public void remove(Prim graphic) {
	
	}


}
