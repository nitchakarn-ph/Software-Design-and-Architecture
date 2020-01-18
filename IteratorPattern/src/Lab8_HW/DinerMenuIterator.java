package Lab8_HW;

public class DinerMenuIterator implements Iterator {

	private MenuItem[] items;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] item) {
		this.items = item;
	}
	
	@Override
	public boolean hasNext() {
		
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
		
		
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position +1 ;
		return menuItem;
	}

}
