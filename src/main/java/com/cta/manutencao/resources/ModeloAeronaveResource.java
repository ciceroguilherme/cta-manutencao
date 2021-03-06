package com.cta.manutencao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cta.manutencao.domain.ModeloAeronave;
import com.cta.manutencao.services.ModeloAeronaveService;

@RestController
@RequestMapping("/modeloAeronave")
public class ModeloAeronaveResource {
	
	@Autowired
	private ModeloAeronaveService modeloAeronaveService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		
		ModeloAeronave modeloAeronave = modeloAeronaveService.buscar(id);
		
		return ResponseEntity.ok().body(modeloAeronave);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody ModeloAeronave modeloAeronave){
		
		modeloAeronaveService.insert(modeloAeronave);
		
		return ResponseEntity.noContent().build();
	}

}
