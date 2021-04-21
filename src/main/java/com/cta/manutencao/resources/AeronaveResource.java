package com.cta.manutencao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cta.manutencao.domain.Aeronave;
import com.cta.manutencao.services.AeronaveService;


@RestController
@RequestMapping("/aeronave")
public class AeronaveResource {
	
	@Autowired
	private AeronaveService aeronaveService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		
		Aeronave aeronave = aeronaveService.buscar(id);
		
		return ResponseEntity.ok().body(aeronave);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Aeronave aeronave){
		
		aeronaveService.insert(aeronave);
		
		return ResponseEntity.noContent().build();
	}

}
