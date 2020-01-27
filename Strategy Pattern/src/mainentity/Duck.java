package mainentity;

import behavior.intf.IDisplay;
import behavior.intf.IQuack;

public class Duck {

	public IQuack quack;
	
	public IDisplay display;
	
	public Duck(IQuack quack, IDisplay display){
		this.quack = quack;
		this.display = display;
	}
	
	public void quack(){
		this.quack.quack();
	}
	
	public void display(){
		this.display.display();
	}
}
