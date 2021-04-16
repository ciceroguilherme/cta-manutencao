package com.cta.manutencao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cta.manutencao.domain.TipoAeronave;
import com.cta.manutencao.services.TipoAeronaveService;

@RestController
@RequestMapping("/tipoAeronave")
public class TipoAeronaveResource {
	
	@Autowired
	private TipoAeronaveService tipoAeronaveService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		
		TipoAeronave tipoAeronave = tipoAeronaveService.buscar(id);
		
		return ResponseEntity.ok().body(tipoAeronave);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody TipoAeronave tipoAeronave){
		
		tipoAeronaveService.insert(tipoAeronave);
		
		return ResponseEntity.noContent().build();
	}

}
