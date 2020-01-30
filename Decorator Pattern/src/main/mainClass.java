package main;

import decorator.Caramel;
import decorator.Cinamon;
import decorator.Cream;
import mainentity.Beverage;
import mainentity.Espresso;

public class mainClass {

	public static void main(String[] args) {
		Beverage beverage = new Caramel(new Cream(new Cream(new Cinamon(new Espresso()))));
		beverage.cost();
		//customer wanted to get an Espresso with Caramel, Cinamon and 2 portions of Cream
		//the order of the addons is not important
	}

}
