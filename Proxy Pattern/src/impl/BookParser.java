package impl;

import intf.IBookParser;

public class BookParser implements IBookParser {

	private int numPages;
	
	public BookParser(String book){
		//expensive parsing
		//setting numPages also takes place here
	}
	
	@Override
	public int getNumPages() {
		return numPages;
	}

}
