package decorator;

import mainentity.Beverage;

public class Caramel extends AddonDecorator {

	private Beverage decoratedComponent;
	
	
	public Caramel(Beverage decoratedComponent){
		this.decoratedComponent = decoratedComponent;
	}
	
	@Override
	public int cost() {
		return decoratedComponent.cost() + 2;
	}

}
