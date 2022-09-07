package com.Bootcamp32.Microservicio01.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Document
public class Customer {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String firstLastName;
	
	private String secondLastName;
	
	private String email;
	
	private CustomerType type;
}