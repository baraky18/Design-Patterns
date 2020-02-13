package intf;

import pojos.Item;

public interface InventoryIterator {

	public boolean hasNext();
	
	public Item current();
	
	public void next();
}
