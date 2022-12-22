package com.awsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsExampleApplication {

	@GetMapping("/")
	public String home() {
		return "Hello World This is Diksha Kadam Welcome to AWS";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsExampleApplication.class, args);
		
		System.out.println("Started");
	}

}
