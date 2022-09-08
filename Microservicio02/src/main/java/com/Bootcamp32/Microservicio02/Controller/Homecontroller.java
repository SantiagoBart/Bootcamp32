package com.Bootcamp32.Microservicio02.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Home")
public class Homecontroller {
	
	@PostMapping("/home")
	public String Home()
	{
		return "Hola Mundo";
	}
}
