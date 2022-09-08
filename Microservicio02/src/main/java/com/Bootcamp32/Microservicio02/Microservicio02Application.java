package com.Bootcamp32.Microservicio02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Microservicio02Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio02Application.class, args);
	}

}
