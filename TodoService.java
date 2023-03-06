package com.todo.restfulApi;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepo;
	
	// save operation
	public Todo saveTodoList(Todo todo) {
		return todoRepo.save(todo);
	}
	
	// read operation
	public List<Todo> findAllTask(){
		
		return (List<Todo>)todoRepo.findAll();
	}
	
	// update operation
	public Todo updateTodoList(Todo todo, Long todoId) {
		 
		Todo todoObj = todoRepo.findById(todoId).get();
		
		if(Objects.nonNull(todo.getTask()) && !"".equalsIgnoreCase(todo.getTask())) {
			 
			todoObj.setTask(todo.getTask());
		}
		
		if(Objects.nonNull(todo.isDone())) {
			todoObj.setDone(todo.isDone());
		}
		
		return todoRepo.save(todoObj);
	}
	
	// delete operation
	public void deleteTodoTask(long todoId) {
		
		todoRepo.deleteById(todoId);
		
	}

}
