package decorator;

import mainentity.Beverage;

public class Cinamon extends AddonDecorator {

	private Beverage decoratedComponent;
	
	public Cinamon(Beverage decoratedComponent){
		this.decoratedComponent = decoratedComponent;
	}
	@Override
	public int cost() {
		return decoratedComponent.cost() + 1;
	}

}
