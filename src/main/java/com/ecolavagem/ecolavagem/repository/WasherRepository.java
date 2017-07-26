package com.ecolavagem.ecolavagem.repository;

import com.ecolavagem.ecolavagem.model.entity.Washer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasherRepository extends JpaRepository<Washer, Long> {

}
