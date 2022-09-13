package com.Bootcamp32.Microservicio02.Model;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {

	private Integer id;
	
	private String name;
	
	private String firstLastName;
	
	private String secondLastName;
	
	private String email;	
}
