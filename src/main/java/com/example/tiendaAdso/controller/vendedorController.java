package com.example.tiendaAdso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tiendaAdso.interfaceService.IVendedorService;
import com.example.tiendaAdso.models.vendedor;

@RequestMapping ("/api/v1/vendedor")
@RestController

public class vendedorController {
	
	@Autowired
	private IVendedorService vendedorService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(
			@ModelAttribute("vendedor") vendedor vendedor
			){
		vendedorService.save(vendedor);
		return new ResponseEntity<>(vendedor,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
	var listaVendedor=vendedorService.findAll();
	return new ResponseEntity<>(listaVendedor,HttpStatus.OK);
	}
	
	@GetMapping("/{id_vendedor}")
	public ResponseEntity<Object> findOne(@PathVariable("id_vendedor") String id_vendedor){
		var vendedor=vendedorService.findOne(id_vendedor);
		return new ResponseEntity<>(vendedor,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id_vendedor}")
	public ResponseEntity<Object> delete(@PathVariable("id_vendedor") String id_vendedor){
		vendedorService.delete(id_vendedor);
		return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
	}
	
	@PutMapping("/{id_vendedor}")
	public ResponseEntity<Object> update(@PathVariable("id_vendedor") String id_vendedor, @ModelAttribute("vendedor") vendedor vendedorUpdate){
		var vendedor= vendedorService.findOne(id_vendedor).get();
		if (vendedor != null) {
			vendedor.setPrimer_nombre(vendedorUpdate.getPrimer_nombre());
			vendedor.setSegundo_nombre(vendedorUpdate.getSegundo_nombre());
			vendedor.setPrimer_apellido(vendedorUpdate.getPrimer_apellido());
			vendedor.setSegundo_apellido(vendedorUpdate.getSegundo_apellido());
			vendedor.setTelefono(vendedorUpdate.getTelefono());
			vendedor.setCorreo(vendedorUpdate.getCorreo());
			vendedor.setDireccion(vendedorUpdate.getDireccion());
			
			vendedorService.save(vendedor);
			return new ResponseEntity<>("Guardado",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Error cliente no encontrado",HttpStatus.BAD_REQUEST);
		}
		
		
	}

}
