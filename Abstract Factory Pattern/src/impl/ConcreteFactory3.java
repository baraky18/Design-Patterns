package impl;

import intf.Factory;
import intf.IProductA;
import intf.IProductB;

public class ConcreteFactory3 implements Factory {

	@Override
	public IProductA getProductA() {
		return new ConcreteProductA3();
	}

	@Override
	public IProductB getProductB() {
		return new ConcreteProductB3();
	}

}
