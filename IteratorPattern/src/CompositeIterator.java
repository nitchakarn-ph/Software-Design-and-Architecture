

import java.util.Stack;

public class CompositeIterator implements Iterator {

	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}else {
			Iterator iterator = (Iterator)stack.peek();
			if(iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
			
		}
	}

	@Override
	public Object next() {
		if(hasNext()) {
			Iterator iterator = (Iterator)stack.peek();
			MenuComponent item = (MenuComponent)iterator.next();
			if(item instanceof Menu) {
				//stack.push(item.createIterator());
			}
			return item;
		}else {
			return null;
		}
		
	}

}
