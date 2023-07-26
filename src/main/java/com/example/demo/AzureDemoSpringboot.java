package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoSpringboot {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoSpringboot.class, args);
	}

	@GetMapping("/message")
	public String helloMessage() {
		return "This is deployed in Azure !!!!!!";
	}
}
