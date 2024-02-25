package com.example.tiendaAdso.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.tiendaAdso.models.producto;

public interface IProductoService {
	
	public String save(producto producto);
	public List<producto> findAll();
	public Optional<producto> findOne(String id_producto);
	public int delete(String id_producto);

}
