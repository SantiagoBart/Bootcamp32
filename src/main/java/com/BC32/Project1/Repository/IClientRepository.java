package com.BC32.Project1.Repository;

import com.BC32.Project1.Model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClientRepository extends MongoRepository<Client, Integer> {
}
