package com.rs.spring.threads.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadApplication.class, args);
	}
}

@RestController
class ApplicationController{

	@GetMapping
	public String ping() throws InterruptedException {
		System.out.println("waiting");
		Thread.sleep(2000);
		return "UP";
	}
}