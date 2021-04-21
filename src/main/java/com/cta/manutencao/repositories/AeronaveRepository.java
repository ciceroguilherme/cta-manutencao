package com.cta.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cta.manutencao.domain.Aeronave;

@Repository
public interface AeronaveRepository extends JpaRepository<Aeronave, Integer>{

}
