package impl;

import intf.TodoList;

public class Todo implements TodoList {

	public String text;
	
	public boolean isDone;
	
	public Todo(String text){
		this.text = text;
	}
	
	@Override
	public boolean isDone() {
		return this.isDone;
	}

}
