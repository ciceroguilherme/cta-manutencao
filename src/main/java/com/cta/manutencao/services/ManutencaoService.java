package com.cta.manutencao.services;

import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cta.manutencao.domain.Manutencao;
import com.cta.manutencao.repositories.ManutencaoRepository;

@Service
public class ManutencaoService {

	@Autowired
	private ManutencaoRepository repository;
	
	public Manutencao insert(Manutencao manutencao) {
		
		Calendar data = Calendar.getInstance();
		
		manutencao.setDataHora(data);
		
		return repository.save(manutencao);
	}
	
	public Manutencao buscar(Integer id) {
		Optional<Manutencao> manutencao = repository.findById(id);
		
		return manutencao.orElse(null);
	}
}
