package com.dvd.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dvd")
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApplication.class, args);
	}

}
