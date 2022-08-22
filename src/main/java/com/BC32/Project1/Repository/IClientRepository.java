package com.BC32.Project1.Repository;

import com.BC32.Project1.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Integer> {
}
