package com.example.tiendaAdso.interfaceService;

import java.util.List;
import java.util.Optional;
import com.example.tiendaAdso.models.vendedor;

public interface IVendedorService {
	
	public String save(vendedor vendedor);
	public List<vendedor> findAll();
	public Optional<vendedor> findOne(String id_vendedor);
	public int delete(String id_vendedor);

}
