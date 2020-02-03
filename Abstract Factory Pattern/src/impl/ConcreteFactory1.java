package impl;

import intf.Factory;
import intf.IProductA;
import intf.IProductB;

public class ConcreteFactory1 implements Factory {

	@Override
	public IProductA getProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public IProductB getProductB() {
		return new ConcreteProductB1();
	}

}
