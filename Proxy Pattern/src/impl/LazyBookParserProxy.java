package impl;

import intf.IBookParser;

public class LazyBookParserProxy implements IBookParser {

	private String book;
	
	private BookParser bookParser = null;
	
	public LazyBookParserProxy(String book){
		this.book = book;
	}
	
	@Override
	public int getNumPages() {
		if(null == bookParser){
			bookParser = new BookParser(book);
		}
		return bookParser.getNumPages();
	}

}
