package com.BC32.Project1.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ClientType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idClientType;

    @Column
    private String name;
}
