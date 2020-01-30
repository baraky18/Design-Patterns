package decorator;

import mainentity.Beverage;

public abstract class AddonDecorator extends Beverage {

	@Override
	public abstract int cost();

}
