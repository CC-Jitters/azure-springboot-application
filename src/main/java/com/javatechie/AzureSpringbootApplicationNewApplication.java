package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureSpringbootApplicationNewApplication {

	@GetMapping("/message")
	public String message() {

		return "Congratulation! You have successfully deployed the application" ;

	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringbootApplicationNewApplication.class, args);
	}

}
