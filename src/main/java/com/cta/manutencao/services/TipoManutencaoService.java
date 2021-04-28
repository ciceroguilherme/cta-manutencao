package com.cta.manutencao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cta.manutencao.domain.TipoManutencao;
import com.cta.manutencao.repositories.TipoManutencaoRepository;

@Service
public class TipoManutencaoService {

	@Autowired
	private TipoManutencaoRepository repository;
	
	public TipoManutencao insert(TipoManutencao tipoManutencao) {
		return repository.save(tipoManutencao);
	}
	
	public TipoManutencao buscar(Integer id) {
		Optional<TipoManutencao> tipoManutencao = repository.findById(id);
		
		return tipoManutencao.orElse(null);
	}
}
