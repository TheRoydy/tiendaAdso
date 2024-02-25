package com.example.tiendaAdso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaAdso.interfaceService.IDetalleVentaService;
import com.example.tiendaAdso.interfaces.IDetalleVenta;
import com.example.tiendaAdso.models.detalleVenta;

@Service

public class detalleVentaService implements IDetalleVentaService {
	
	@Autowired
	private IDetalleVenta data;

	@Override
	public String save(detalleVenta detalleVenta) {
		data.save(detalleVenta);
		return detalleVenta.getId_detalle();
	}

	@Override
	public List<detalleVenta> findAll() {
		List<detalleVenta> listaDetalleVenta=(List<detalleVenta>) data.findAll();
		return listaDetalleVenta;
	}

	@Override
	public Optional<detalleVenta> findOne(String id) {
		Optional<detalleVenta> detalleVenta=data.findById(id);
		return detalleVenta;
	}

	@Override
	public int delete(String id) {
		data.deleteById(id);
		return 1;
	}
	

}
