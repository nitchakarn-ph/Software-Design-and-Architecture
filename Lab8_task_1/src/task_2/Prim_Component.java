package task_2;

import java.util.ArrayList;
import java.util.Iterator;

public  class Prim_Component implements Prim{

	Iterator iterator = null;
	
	ArrayList<Prim> child_components = new ArrayList<Prim>();
	@Override
	public void render() {
		for (Prim prim : child_components) {
			prim.render();}
		
		
	}

	@Override
	public float volume() {
		float total = 0;
		for (Prim prim : child_components) {
			total+=prim.volume();
		}
		return total;
	}

	@Override
	public void add(Prim graphic) {
		child_components.add(graphic);
		
	}

	@Override
	public void remove(Prim graphic) {
		child_components.remove(graphic);
		
	}

	@Override
	public Iterator createIterator() {
		if (iterator==null) {
			iterator = new CompositeIterator(child_components.iterator());
		}
		return iterator;
	}

}
