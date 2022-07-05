package com.example.demo2022;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2022Application implements CommandLineRunner{
	public static final Log LOGGER = LogFactory.getLog(Demo2022Application.class); 
	public static void main(String[] args) {
		SpringApplication.run(Demo2022Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Welcome to CommandLineRunner");
		System.out.println("Welcome to Springboot");
	}

}
