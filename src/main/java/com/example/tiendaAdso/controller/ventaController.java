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

import com.example.tiendaAdso.interfaceService.IVentaService;
import com.example.tiendaAdso.models.venta;

@RequestMapping ("/api/v1/venta")
@RestController
public class ventaController {
	
	@Autowired
	private IVentaService ventaService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(
			@ModelAttribute("venta") venta venta
			){
		ventaService.save(venta);
		return new ResponseEntity<>(venta,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> findAll(){
	var listaVenta=ventaService.findAll();
	return new ResponseEntity<>(listaVenta,HttpStatus.OK);
	}
	
	@GetMapping("/{id_venta}")
	public ResponseEntity<Object> findOne(@PathVariable("id_venta") String id_venta){
		var venta=ventaService.findOne(id_venta);
		return new ResponseEntity<>(venta,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id_venta}")
	public ResponseEntity<Object> delete(@PathVariable("id_venta") String id_venta){
		ventaService.delete(id_venta);
		return new ResponseEntity<>("Registro Eliminado",HttpStatus.OK);
	}
	
	@PutMapping("/{id_venta}")
	public ResponseEntity<Object> update(@PathVariable("id_venta") String id_venta, @ModelAttribute("venta") venta ventaUpdate){
		var venta= ventaService.findOne(id_venta).get();
		if (venta != null) {
			venta.setFecha_venta(ventaUpdate.getFecha_venta());
			venta.setTotal_venta(ventaUpdate.getTotal_venta());
			venta.setTipo_pago(ventaUpdate.getTipo_pago());
			
			ventaService.save(venta);
			return new ResponseEntity<>("Guardado",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Error cliente no encontrado",HttpStatus.BAD_REQUEST);
		}
		
			
	}
			
}
