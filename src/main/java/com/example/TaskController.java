package com.example;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;
	
	@RequestMapping("/")
	public String HelloWorld(){
		return "Hello World !";
	}
	
	@RequestMapping("/tasks")
	public Collection<Task> getTasks(){
		return taskRepository.findAll();
	}
	

	
}
