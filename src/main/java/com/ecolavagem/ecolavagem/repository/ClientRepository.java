package com.ecolavagem.ecolavagem.repository;

import com.ecolavagem.ecolavagem.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gabriel on 19/07/17.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
