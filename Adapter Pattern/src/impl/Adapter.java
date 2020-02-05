package impl;

import intf.ITarget;
import mainentity.Adaptee;

public class Adapter implements ITarget {

	private Adaptee adptee;
	
	public Adapter(Adaptee adaptee){
		this.adptee = adaptee;
	}
	
	@Override
	public void request() {
		this.adptee.specificRequest();
	}

}
