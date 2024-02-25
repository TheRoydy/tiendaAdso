package com.example.tiendaAdso.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.tiendaAdso.models.venta;

public interface IVentaService {
	
	public String save(venta venta);
	public List<venta> findAll();
	public Optional<venta> findOne(String id_venta);
	public int delete(String id_venta);

}
