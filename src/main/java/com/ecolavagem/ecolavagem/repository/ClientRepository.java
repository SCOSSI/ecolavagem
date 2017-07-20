package com.ecolavagem.ecolavagem.repository;

import com.ecolavagem.ecolavagem.model.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gabriel on 19/07/17.
 */
@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
