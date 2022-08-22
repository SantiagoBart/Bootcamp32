package com.BC32.Project1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduct;
	
	@Column
    private String name;
	
	@ManyToOne
    @JoinColumn(name = "idType", nullable = false, foreignKey =@ForeignKey(name = "fk_type_product"))
	private ProductTypes idType;
}
