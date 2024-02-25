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

import com.example.tiendaAdso.interfaceService.IClienteService;
import com.example.tiendaAdso.models.cliente;

@RequestMapping("/api/v1/cliente")
@RestController
public class clienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(
			
			@ModelAttribute("cliente")cliente cliente
			){
		
		clienteService.save(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
		var listaClientes=clienteService.findAll();
		return new ResponseEntity<>(listaClientes,HttpStatus.OK);
	}
	
	//@PathVariable recibe una variable por el enlace
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable("id") String id){
		var cliente=clienteService.findOne(id);
		return new ResponseEntity<>(cliente,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") String id){
		clienteService.delete(id);
		return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") String id, @ModelAttribute("cliente") cliente clienteUpdate){
		var cliente= clienteService.findOne(id).get();
		if (cliente != null) {
			cliente.setTipo_documento(clienteUpdate.getTipo_documento());
			cliente.setNumero_documento(clienteUpdate.getNumero_documento());
			cliente.setPrimer_name(clienteUpdate.getPrimer_name());
			cliente.setSegundo_name(clienteUpdate.getSegundo_name());
			cliente.setPrimer_apellido(clienteUpdate.getPrimer_apellido());
			cliente.setSegundo_apellido(clienteUpdate.getSegundo_apellido());
			cliente.setTelefono(clienteUpdate.getTelefono());
			cliente.setCorreo(clienteUpdate.getCorreo());
			cliente.setDireccion(clienteUpdate.getDireccion());
			
			clienteService.save(cliente);
			return new ResponseEntity<>("Guardado",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Error cliente no encontrado",HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	
}
