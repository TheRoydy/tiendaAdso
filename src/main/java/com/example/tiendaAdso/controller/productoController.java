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

import com.example.tiendaAdso.interfaceService.IProductoService;
import com.example.tiendaAdso.models.producto;

@RequestMapping ("/api/v1/producto")
@RestController

public class productoController {
	
	@Autowired
	private IProductoService productoService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(
			@ModelAttribute("producto") producto producto
			){
		productoService.save(producto);
		return new ResponseEntity<>(producto,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
	var listaProducto=productoService.findAll();
	return new ResponseEntity<>(listaProducto,HttpStatus.OK);
	}
	
	@GetMapping("/{id_producto}")
	public ResponseEntity<Object> findOne(@PathVariable("id_producto") String id_producto){
		var producto=productoService.findOne(id_producto);
		return new ResponseEntity<>(producto,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id_producto}")
	public ResponseEntity<Object> delete(@PathVariable("id_producto") String id_producto){
		productoService.delete(id_producto);
		return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
	}
	
	@PutMapping("/{id_producto}")
	public ResponseEntity<Object> update(@PathVariable("id_producto") String id_producto, @ModelAttribute("producto") producto productoUpdate){
		var producto = productoService.findOne(id_producto).get();
		if (producto != null) {
			producto.setNombre_producto(productoUpdate.getNombre_producto());
			producto.setDescripcion_producto(productoUpdate.getDescripcion_producto());
			producto.setPrecio_producto(productoUpdate.getPrecio_producto());
			producto.setStock(productoUpdate.getStock());
			producto.setCategoria(productoUpdate.getCategoria());
			
			productoService.save(producto);
			return new ResponseEntity<>("Guardado",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Error producto no encontrado",HttpStatus.BAD_REQUEST);
		}
		
	}

}
