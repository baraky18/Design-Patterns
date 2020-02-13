package impl;

import intf.InventoryIterator;
import pojos.Item;

public class HandHeldItemIterator implements InventoryIterator {

	public HandHeldItemInventory inventory; 
	
	public int index = 0;
	
	public HandHeldItemIterator(HandHeldItemInventory inventory){
		this.inventory = inventory;
	}
	
	@Override
	public boolean hasNext() {
		return this.index < 2;
	}

	@Override
	public Item current() {
		switch(this.index){
		case 0:
			return this.inventory.right;
		case 1:
			return this.inventory.left;
		default:
			return null;
		}
	}

	@Override
	public void next() {
		this.index += 1;
	}
}
