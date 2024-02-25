package com.example.tiendaAdso.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.tiendaAdso.models.cliente;

public interface IClienteService {
	
	/*
	 * Vamos a definir los metodos del CRUD
	 * Create
	 * Read
	 * Update
	 * Delete
	 */
	
public String save(cliente cliente);	
public List<cliente> findAll();
public Optional<cliente> findOne(String id);
public int delete(String id);

}
