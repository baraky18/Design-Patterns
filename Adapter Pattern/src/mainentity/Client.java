package mainentity;

import impl.Adapter;
import intf.ITarget;

public class Client {

	private ITarget target = new Adapter(new Adaptee());
	
	public void request(){
		target.request();
	}
}
