package com.example.tiendaAdso.interfaces;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.tiendaAdso.models.cliente;

@Repository

public interface ICliente extends CrudRepository<cliente,String> {
	
	/*
	 * Imcluye las funciones basicas del CRUD
	*/

}
