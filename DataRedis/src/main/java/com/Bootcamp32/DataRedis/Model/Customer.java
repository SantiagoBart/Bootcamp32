package com.Bootcamp32.DataRedis.Model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
    private String lastName;
    private String email;
}
