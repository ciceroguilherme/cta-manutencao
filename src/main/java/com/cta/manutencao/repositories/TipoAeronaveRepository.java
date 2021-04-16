package com.cta.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cta.manutencao.domain.TipoAeronave;

@Repository
public interface TipoAeronaveRepository extends JpaRepository<TipoAeronave, Integer>{

}
