package com.example.tiendaAdso.interfaces;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.tiendaAdso.models.vendedor;

@Repository

public interface IVendedor extends CrudRepository<vendedor,String> {

}
