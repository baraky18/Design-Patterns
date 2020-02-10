package intf;

public abstract class View {

	private IResource resource;
	
	public View(IResource resouce){
		this.resource = resouce;
	}
	
	public abstract String show();
}
