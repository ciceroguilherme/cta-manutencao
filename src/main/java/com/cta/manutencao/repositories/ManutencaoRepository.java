package com.cta.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cta.manutencao.domain.Manutencao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer> {

}
