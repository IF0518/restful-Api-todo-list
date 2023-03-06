package com.todo.restfulApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo-list")
public class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long todoId;
	private String task;
	private boolean done;
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	

}
