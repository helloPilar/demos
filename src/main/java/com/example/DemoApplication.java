package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private TaskRepository taskRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	private void initDataBase(){
	
		System.out.println("Inicializando los datos en la base de datos h2");
		Task task = new Task("task1","description1"); 
		taskRepository.save(task);
	
	}
	
	
//	@Bean
//	InitializingBean saveData(TaskRepository taskRepository){
//		return () -> {
//			taskRepository.save(new Task("task1", "description1"));
//			taskRepository.save(new Task("task2", "description2"));
//			taskRepository.save(new Task("task3", "description3"));
//		};
//	}
}
