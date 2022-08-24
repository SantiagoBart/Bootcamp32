package com.BC32.Project1.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
public class ProductTypes {
	
	@Id
	private Integer id;
	
    private String name;
}
