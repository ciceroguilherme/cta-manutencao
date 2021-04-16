package com.cta.manutencao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cta.manutencao.domain.TipoAeronave;
import com.cta.manutencao.repositories.TipoAeronaveRepository;

@Service
public class TipoAeronaveService {
	
	@Autowired
	private TipoAeronaveRepository repository;
	
	public TipoAeronave insert(TipoAeronave tipoAeronave) {
		return repository.save(tipoAeronave);
	}
	
	public TipoAeronave buscar(Integer id) {
		Optional<TipoAeronave> tipoAeronave = repository.findById(id);
		
		return tipoAeronave.orElse(null);
	}

}
