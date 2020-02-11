package intf;

public abstract class DbRecord {

	public abstract void validate();
	
	public abstract void afterSave();
	
	public void save(){
		this.validate();
		//save record to DB implementation
		this.afterSave();
	}
}
