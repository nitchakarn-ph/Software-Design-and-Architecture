package task_2;

import java.util.Iterator;

public class Sphere implements Prim {
    
	private float radius;
	public Sphere(float f){
		this.radius = f;
	}
	
	public void render() {
		System.out.println("Sphere R: "+ radius);
	}
	
	public float volume() {
		return (float) (Math.PI * radius * radius * radius * 4/3);
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
