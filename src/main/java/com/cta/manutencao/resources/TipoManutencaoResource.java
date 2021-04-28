package com.cta.manutencao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cta.manutencao.domain.TipoManutencao;
import com.cta.manutencao.services.TipoManutencaoService;

@RestController
@RequestMapping("/tipoManutencao")
public class TipoManutencaoResource {
	
	@Autowired
	private TipoManutencaoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		TipoManutencao tipoManutencao = service.buscar(id);
		
		return ResponseEntity.ok().body(tipoManutencao);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody TipoManutencao tipoManutencao){
		
		service.insert(tipoManutencao);
		
		return ResponseEntity.noContent().build();
	}
}
