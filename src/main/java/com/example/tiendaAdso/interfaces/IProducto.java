package com.example.tiendaAdso.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.tiendaAdso.models.producto;

@Repository

public interface IProducto extends CrudRepository<producto,String> {

}
