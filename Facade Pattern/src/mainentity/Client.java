package mainentity;

public class Client {

	private Facade facade;
	
	public Client(Facade facade){
		this.facade = facade;
	}
	
	public void specificAction(){
		facade.doOneThing();
		facade.doSecondThing();
		facade.doThirdThing();
	}
}
