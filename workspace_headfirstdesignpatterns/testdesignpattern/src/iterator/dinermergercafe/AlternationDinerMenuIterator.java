package iterator.dinermergercafe;

import java.util.Calendar;
import java.util.Iterator;

public class AlternationDinerMenuIterator implements Iterator{

	MenuItem[] items;
	int position;
	
	public AlternationDinerMenuIterator(MenuItem[] items){
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException(
				"Alternation Diner Menu Iterator does not support remove");
	}

}
