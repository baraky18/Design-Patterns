package impl;

import intf.IResource;
import intf.View;

public class LongFormView extends View{

	public LongFormView(IResource resouce) {
		super(resouce);
	}

	@Override
	public String show() {
		return null;//constructs html with the resource's methods
	}

}
