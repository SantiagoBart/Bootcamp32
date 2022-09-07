package com.Bootcamp32.Microservicio01.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class ProductType {
	
	@Id
	private Integer id;
	
	private String name;
}
