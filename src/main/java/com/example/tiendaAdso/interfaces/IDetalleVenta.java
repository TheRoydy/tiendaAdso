package com.example.tiendaAdso.interfaces;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.tiendaAdso.models.detalleVenta;

@Repository

public interface IDetalleVenta extends CrudRepository<detalleVenta,String>  {

}
