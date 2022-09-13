package com.Bootcamp32.Microservicio02.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

	private Integer id;
	
	private String name;
	
	private Double maintanceComission;
	
	private Integer unlimitedMoves;
	
	private Integer moveCount;		
}
