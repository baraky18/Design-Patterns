package impl;

import intf.ICreator;
import intf.IProduct;

public class ConcreteCreator implements ICreator {

	@Override
	public IProduct factoryMethod() {
		IProduct product = new ConcreteProduct();
		//construct the product object
		return product;
	}

}
