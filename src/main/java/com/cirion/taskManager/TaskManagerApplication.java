package com.cirion.taskManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class TaskManagerApplication {

	@GetMapping
	public String getTestHome() {return "Teste Home";}
	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
