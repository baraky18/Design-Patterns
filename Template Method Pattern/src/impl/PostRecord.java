package impl;

import intf.DbRecord;

public class PostRecord extends DbRecord {

	@Override
	public void validate() {
		//validate that post doesn't contain malicious code implementation
	}

	@Override
	public void afterSave() {
		//send message to the user that the post is saved
	}

}
