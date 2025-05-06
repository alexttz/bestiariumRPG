package com.example.bestiarium.repository;

import com.example.bestiarium.model.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriaturaRepository extends JPARepository<Criatura, Long>{

}
