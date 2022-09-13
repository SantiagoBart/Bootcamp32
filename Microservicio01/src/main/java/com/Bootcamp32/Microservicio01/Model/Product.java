package com.Bootcamp32.Microservicio01.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Product {

	@Id
	private Integer id;
	
	private String name;
	
	private Double maintanceComission;
	
	private Integer unlimitedMoves;
	
	private Integer moveCount;	
	
	private ProductType type;
}
