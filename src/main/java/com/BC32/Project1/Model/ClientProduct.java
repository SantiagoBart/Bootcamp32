package com.BC32.Project1.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ClienteProducto")
@Data
@NoArgsConstructor
public class ClientProduct {

	@Id	
	private Integer id;
		
	
	private Client idClient;
	
	
	private Product idProduct;
}
