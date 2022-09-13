package com.Bootcamp32.Microservicio03.Beans;

import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KafkaRequest {
	
	private Integer id;
		
	private String message;	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "KafkaRequest [id = " + id  + ", message = " + message + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KafkaRequest other = (KafkaRequest) obj;
		return Objects.equals(id, other.id) && Objects.equals(message, other.message);
	}

	public KafkaRequest(Integer id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public KafkaRequest() {
		super();
	}
}
