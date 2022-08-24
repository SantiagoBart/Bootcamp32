package com.BC32.Project1.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Data
@NoArgsConstructor
@Document(collection = "client")
@ToString
public class Client {

	@Id
    private Integer idClient;

    private String name;

    private String lastName;

    private String motherLastName;

    private String email;

    private String phone;

    private ClientType clientType;

}
