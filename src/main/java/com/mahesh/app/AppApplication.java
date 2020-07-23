package com.mahesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println("Welcome to GitHub");
		SpringApplication.run(AppApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "mahesh!!!";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!!";
	}

}
