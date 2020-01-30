package decorator;

import mainentity.Beverage;

public class Cream extends AddonDecorator {

	private Beverage decoratedComponent;
	
	public Cream(Beverage decoratedComponent){
		this.decoratedComponent = decoratedComponent;
	}
	@Override
	public int cost() {
		return decoratedComponent.cost() + 3;
	}

}
