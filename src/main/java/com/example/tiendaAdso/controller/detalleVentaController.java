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

import com.example.tiendaAdso.interfaceService.IDetalleVentaService;
import com.example.tiendaAdso.models.detalleVenta;

@RequestMapping("/api/v1/detalleVenta")
@RestController



public class detalleVentaController {
	
	@Autowired
	private IDetalleVentaService detalleVentaService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(
			@ModelAttribute("detalleVenta") detalleVenta detalleVenta
			){
		
		detalleVentaService.save(detalleVenta);
		return new ResponseEntity<>(detalleVenta,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
		var listaDetalleVenta=detalleVentaService.findAll();
		return new ResponseEntity<>(listaDetalleVenta,HttpStatus.OK);
	}
	
	@GetMapping("/{id_detalle}")
	public ResponseEntity<Object> findOne(@PathVariable("id_detalle") String id_detalle){
		var detalleVenta=detalleVentaService.findOne(id_detalle);
		return new ResponseEntity<>(detalleVenta,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id_detalle}")
	public ResponseEntity<Object> delete(@PathVariable("id_detalle") String id_detalle){
		detalleVentaService.delete(id_detalle);
		return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
	}
	
	@PutMapping("/{id_detalle}")
	public ResponseEntity<Object> update(@PathVariable("id_detalle") String id_detalle, @ModelAttribute("detalleVenta") detalleVenta detalleVentaUpdate){
		var detalleVenta = detalleVentaService.findOne(id_detalle).get();
		if (detalleVenta != null) {
			detalleVenta.setCantidad(detalleVentaUpdate.getCantidad());
			detalleVenta.setPrecio_unitario(detalleVentaUpdate.getPrecio_unitario());
			detalleVenta.setDescuento(detalleVentaUpdate.getDescuento());
			
			detalleVentaService.save(detalleVenta);
			return new ResponseEntity<>("Guardado",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Error Producto no encontrado",HttpStatus.BAD_REQUEST);
		}
	}

}
