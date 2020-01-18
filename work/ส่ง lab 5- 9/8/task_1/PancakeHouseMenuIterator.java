import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;
	
	public PancakeHouseMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	/*public PancakeHouseMenuIterator(ArrayList menuItems) {
		for(int i=0;i<menuItems.size();i++) {
			MenuItem items = (MenuItem)menuItems.get(i);
		}
		
	}*/

	@Override
	public boolean hasNext() {
		if(position>= items.length || items[position] == null)
		{
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position+1;
		return menuItem;
	}

}
