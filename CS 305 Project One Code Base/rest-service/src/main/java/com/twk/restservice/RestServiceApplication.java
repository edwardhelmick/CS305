package com.twk.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		System.out.println("version: " + SpringVersion.getVersion());
		
		SpringApplication.run(RestServiceApplication.class, args);
	}

}

//current 5.3.8