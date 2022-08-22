package com.BC32.Project1.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idClient;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String motherLastName;

    @Column
    private String email;

    @Column
    private String phone;

}
