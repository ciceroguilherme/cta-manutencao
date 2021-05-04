package com.cta.manutencao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cta.manutencao.domain.Manutencao;
import com.cta.manutencao.services.ManutencaoService;

@RestController
@RequestMapping("/manutencao")
public class ManutencaoResource {
	
	@Autowired
	private ManutencaoService manutencaoService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		
		Manutencao manutencao = manutencaoService.buscar(id);
		
		return ResponseEntity.ok().body(manutencao);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Manutencao manutencao){
		manutencaoService.insert(manutencao);
		
		return ResponseEntity.noContent().build();
	}

}
