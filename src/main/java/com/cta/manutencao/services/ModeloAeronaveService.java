package com.cta.manutencao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cta.manutencao.domain.ModeloAeronave;
import com.cta.manutencao.repositories.ModeloAeronaveRepository;

@Service
public class ModeloAeronaveService {
	
	@Autowired
	private ModeloAeronaveRepository repository;
	
	public ModeloAeronave insert(ModeloAeronave modeloAeronave) {
		return repository.save(modeloAeronave);
	}
	
	public ModeloAeronave buscar(Integer id) {
		Optional<ModeloAeronave> modeloAeronave = repository.findById(id);
		
		return modeloAeronave.orElse(null);
	}

}
