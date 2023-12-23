package com.example.realtimecollaborative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.realtimecollaborative")
public class RealTimeCollaborativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeCollaborativeApplication.class, args);
	}

}
