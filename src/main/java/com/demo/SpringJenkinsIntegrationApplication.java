package com.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	Logger logger =  LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		System.out.println("Application is started");
	}

	public static void main(String[] args) {
		System.out.println("Application execution starts");
		System.out.println("my second commit");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
