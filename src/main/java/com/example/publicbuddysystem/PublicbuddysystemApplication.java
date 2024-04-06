package com.example.publicbuddysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PublicbuddysystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicbuddysystemApplication.class, args);
	}

}
