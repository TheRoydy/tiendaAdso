package com.example.tiendaAdso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaAdso.interfaceService.IVendedorService;
import com.example.tiendaAdso.interfaces.IVendedor;
import com.example.tiendaAdso.models.vendedor;

@Service

public class vendedorService implements IVendedorService {
	
	@Autowired
	private IVendedor data;
	
	@Override
	public String save(com.example.tiendaAdso.models.vendedor vendedor) {
		data.save(vendedor);
		return vendedor.getId_vendedor();
	}
	
	@Override 
	public List<vendedor> findAll(){
		List<vendedor> listaVendedor=(List<vendedor>) data.findAll();
		return listaVendedor;
	}
	
	@Override
	public Optional<vendedor> findOne(String id){
		Optional<vendedor> vendedor=data.findById(id);
		return vendedor;
	}
	
	@Override
	public int delete(String id) {
		data.deleteById(id);
		return 1;
	}

}
