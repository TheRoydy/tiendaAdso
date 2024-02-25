package com.example.tiendaAdso.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tiendaAdso.models.venta;

@Repository

public interface IVenta extends CrudRepository<venta,String> {

}
