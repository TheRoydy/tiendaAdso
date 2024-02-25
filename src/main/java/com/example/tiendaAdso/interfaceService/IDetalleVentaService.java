package com.example.tiendaAdso.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.tiendaAdso.models.detalleVenta;

public interface IDetalleVentaService {
	
	public String save(detalleVenta detalleVenta);	
	public List<detalleVenta> findAll();
	public Optional<detalleVenta> findOne(String id);
	public int delete(String id);

}
