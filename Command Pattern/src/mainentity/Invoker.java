package mainentity;

import intf.ICommand;

public class Invoker {

	public ICommand on;
	public ICommand off;
	public ICommand dimmUp;
	public ICommand dimmDown;
	
	public Invoker(ICommand on, ICommand off, ICommand dimmUp, ICommand dimmDown){
		this.on = on;
		this.off = off;
		this.dimmUp = dimmUp;
		this.dimmDown = dimmDown;
	}
	
	public void clickOn(){
		this.on.execute();
	}
	
	public void clickOff(){
		this.off.execute();
	}
	
	public void clickDimmUp(){
		this.dimmUp.execute();
	}
	
	public void clickDimmDown(){
		this.dimmDown.execute();
	}
}
