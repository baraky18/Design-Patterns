package impl;

import intf.IResource;
import intf.View;

public class ShortFormView extends View {

	public ShortFormView(IResource resouce) {
		super(resouce);
	}

	@Override
	public String show() {
		return null;//constructs html with the resource's methods
	}

}
