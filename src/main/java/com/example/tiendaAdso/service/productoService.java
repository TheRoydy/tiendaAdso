package com.example.tiendaAdso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaAdso.interfaceService.IProductoService;
import com.example.tiendaAdso.interfaces.IProducto;
import com.example.tiendaAdso.models.producto;

@Service

public class productoService implements IProductoService {
	
	@Autowired
	private IProducto data;
	
	@Override
	public String save(producto producto) {
		data.save(producto);
		return producto.getId_producto();
	}
	
	@Override
	public List<producto> findAll(){
		List<producto> listaProducto=(List<producto>) data.findAll();
		return listaProducto;
	}
	
	@Override
	public Optional<producto> findOne(String id){
		Optional<producto> producto=data.findById(id);
		return producto;
	}
	
	@Override
	public int delete(String id) {
		data.deleteById(id);
		return 1;
	}

}
