package com.Bootcamp32.Microservicio01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Microservicio01Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio01Application.class, args);
	}

}
