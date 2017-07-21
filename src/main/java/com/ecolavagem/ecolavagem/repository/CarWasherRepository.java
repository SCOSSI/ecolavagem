package com.ecolavagem.ecolavagem.repository;

import com.ecolavagem.ecolavagem.model.entity.CarWasherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWasherRepository extends JpaRepository<CarWasherEntity, Long> {

}
