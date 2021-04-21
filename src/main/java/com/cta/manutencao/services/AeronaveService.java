package com.cta.manutencao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cta.manutencao.domain.Aeronave;
import com.cta.manutencao.repositories.AeronaveRepository;

@Service
public class AeronaveService {
	
	@Autowired
	private AeronaveRepository repository;
	
	public Aeronave insert(Aeronave aeronave) {
		return repository.save(aeronave);
	}
	
	public Aeronave buscar(Integer id) {
		Optional<Aeronave> Aeronave = repository.findById(id);
		
		return Aeronave.orElse(null);
	}

}
