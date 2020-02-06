package mainentity;

import otherclasses.ClassA;
import otherclasses.ClassB;
import otherclasses.ClassC;

public class Facade {

	private ClassA classA;
	private ClassB classB;
	private ClassC classC;
	
	public Facade(){
		classA = new ClassA();
		classB = new ClassB();
		classC = new ClassC();
	}	
	
	public void doOneThing(){
		classA.doOneThing();
	}
	
	public void doSecondThing(){
		classB.doSecondThing();
	}
	
	public void doThirdThing(){
		classC.doThirdThing();
	}
}
