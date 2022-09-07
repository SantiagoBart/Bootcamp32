package com.Bootcamp32.Microservicio01.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Document
public class CustomerType {
	
	@Id
	private Integer idCustomerType;
	
	private String name;
}
