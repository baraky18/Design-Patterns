package impl;

import java.util.List;

import intf.TodoList;

public class Project implements TodoList {

	public String title;
	
	public boolean isDone;
	
	public List<TodoList> todos;
	
	public Project(String title, List<TodoList> todos){
		this.title = title;
		this.todos = todos;
	}
	
	@Override
	public boolean isDone() {
		for(TodoList todo : todos){
			if(!todo.isDone()){
				return false;
			}
		}
		return this.isDone;
	}

}
