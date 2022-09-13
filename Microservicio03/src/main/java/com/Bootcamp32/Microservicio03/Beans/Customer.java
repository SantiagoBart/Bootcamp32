package com.Bootcamp32.Microservicio03.Beans;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(Integer id, String name, String firstLastName, String secondLastName, String email) {
		super();
		this.id = id;
		this.name = name;
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		this.email = email;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", firstLastName=" + firstLastName + ", secondLastName=" + secondLastName
				+ ", email=" + email + "]";
	}
	
	
}
