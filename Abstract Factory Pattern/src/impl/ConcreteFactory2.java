package impl;

import intf.Factory;
import intf.IProductA;
import intf.IProductB;

public class ConcreteFactory2 implements Factory {

	@Override
	public IProductA getProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public IProductB getProductB() {
		return new ConcreteProductB2();
	}

}
