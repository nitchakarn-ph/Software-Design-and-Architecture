

public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position =0;
	
	public DinerMenuIterator(MenuItem[] item) {
		this.items = item;
	}
	
	//check item
	//if all elements of the array and return true;
	//if there are more to iterate through
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null ) {
			return false;
		}else {
			return true;
		}
		
	}

	//return item in the array and increment the position
	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position+1;
		
		return menuItem;
	}

}
