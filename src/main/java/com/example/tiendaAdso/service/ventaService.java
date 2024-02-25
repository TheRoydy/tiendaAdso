package com.example.tiendaAdso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaAdso.interfaceService.IVentaService;
import com.example.tiendaAdso.interfaces.IVenta;
import com.example.tiendaAdso.models.venta;

@Service

public class ventaService implements IVentaService {
	
	@Autowired
	private IVenta data;
	
	@Override
	public String save(com.example.tiendaAdso.models.venta venta) {
		data.save(venta);
		return venta.getId_venta();
	}
	
	@Override
	public List<venta> findAll(){
		List<venta> listaVenta=(List<venta>) data.findAll();
		return listaVenta;
	}
	
	@Override
	public Optional<venta> findOne(String id){
		Optional<venta> venta=data.findById(id);
		return venta;
	}
	
	@Override
	public int delete(String id) {
		data.deleteById(id);
		return 1;
	}

}
