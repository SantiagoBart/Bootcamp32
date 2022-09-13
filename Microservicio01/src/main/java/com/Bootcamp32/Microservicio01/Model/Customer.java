package com.Bootcamp32.Microservicio01.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Customer {
	
	@MongoId
	private Integer id;
	
	private String name;
	
	private String firstLastName;
	
	private String secondLastName;
	
	private String email;
	
	private CustomerType type;
}
