package com.npate.heroku.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.npate.heroku.service.controller.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
