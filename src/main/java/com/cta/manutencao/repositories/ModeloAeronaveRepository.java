package com.cta.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cta.manutencao.domain.ModeloAeronave;

@Repository
public interface ModeloAeronaveRepository extends JpaRepository<ModeloAeronave, Integer>{

}
