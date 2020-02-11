package impl;

import intf.DbRecord;

public class UserRecord extends DbRecord {

	@Override
	public void validate() {
		//check if user has first name and last name implementation
	}

	@Override
	public void afterSave() {
		//send message to the user that he is saved
	}

}
