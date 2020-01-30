package main;

import behavior.impl.ColorDisplaying;
import behavior.impl.LoudQuacking;
import behavior.impl.SimpleDisplaying;
import behavior.impl.SimpleQuacking;
import mainentity.Duck;

public class mainClass {

	public static void main(String[] args) {
		ColorDisplaying colorDisplaying = new ColorDisplaying();
		SimpleQuacking simpleQuacking = new SimpleQuacking();
		LoudQuacking loudQuacking = new LoudQuacking();
		SimpleDisplaying simpleDisplaying = new SimpleDisplaying();
		Duck duck1 = new Duck(simpleQuacking, colorDisplaying);
		Duck duck2 = new Duck(loudQuacking, colorDisplaying);
		Duck duck3 = new Duck(simpleQuacking, simpleDisplaying);
		Duck duck4 = new Duck(loudQuacking, simpleDisplaying);
		//instead of creating 4 types of Ducks that inherits from a Duck interface,
		//I am making the behavior of the Duck flexible
	}

}
