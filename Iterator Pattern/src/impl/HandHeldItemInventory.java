package impl;

import intf.Inventory;
import intf.InventoryIterator;
import pojos.Item;

public class HandHeldItemInventory implements Inventory {

	public Item right;
	
	public Item left;
	
	public HandHeldItemInventory(Item right, Item left){
		this.right = right;
		this.left = left;
	}
	
	@Override
	public InventoryIterator getIterator() {
		return new HandHeldItemIterator(this);
	}

}
