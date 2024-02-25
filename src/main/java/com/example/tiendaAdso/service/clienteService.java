package com.example.tiendaAdso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaAdso.interfaceService.IClienteService;
import com.example.tiendaAdso.interfaces.ICliente;
import com.example.tiendaAdso.models.cliente;

@Service


public class clienteService implements IClienteService {
	
	@Autowired
	private ICliente data;

	@Override
	public String save(cliente cliente) {
		data.save(cliente);
		return cliente.getId();
	}

	@Override
	public List<cliente> findAll() {
		List<cliente> listaCliente=(List<cliente>) data.findAll();
		//(List<client>) es un cast ya que
		//findAll() retorna un objeto distinto
		//retorna iterable<cliente>
		//se convierte a list<cliente>
		return listaCliente;
	}

	@Override
	public Optional<cliente> findOne(String id) {
		Optional<cliente> cliente=data.findById(id);
		return cliente;
	}

	@Override
	public int delete(String id) {
		data.deleteById(id);
		return 1;
	}
	

}
