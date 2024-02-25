package com.example.tiendaAdso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="detalle")

public class detalleVenta {
	
	/*
	 id_detalle
	 id_producto
	 cantidad
	 precio_unitario
	 descuento
	 */
	
	@Id
	@GeneratedValue(strategy =GenerationType.UUID)
	@Column(name="id_detalle", nullable=false, length = 36)
	private String id_detalle;
	
	@ManyToOne
	@JoinColumn(name="id_venta")
	private venta venta;
	
	@ManyToOne
	@JoinColumn(name="id_producto")
	private producto producto;
	
	
	@Column(name="cantidad", nullable=false, length = 30)
	private int cantidad;
	
	
	@Column(name="precio_unitario", nullable=false, length = 30)
	private float precio_unitario;
	
	
	@Column(name="descuento", nullable=false, length = 30)
	private String descuento;


	public detalleVenta() {
		super();
	}


	public detalleVenta(String id_detalle, com.example.tiendaAdso.models.venta venta,
			com.example.tiendaAdso.models.producto producto, int cantidad, float precio_unitario, String descuento) {
		super();
		this.id_detalle = id_detalle;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.descuento = descuento;
	}


	public String getId_detalle() {
		return id_detalle;
	}


	public void setId_detalle(String id_detalle) {
		this.id_detalle = id_detalle;
	}


	public venta getVenta() {
		return venta;
	}


	public void setVenta(venta venta) {
		this.venta = venta;
	}


	public producto getProducto() {
		return producto;
	}


	public void setProducto(producto producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public float getPrecio_unitario() {
		return precio_unitario;
	}


	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	public String getDescuento() {
		return descuento;
	}


	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}


	

	
	
	
	
	

	

}
