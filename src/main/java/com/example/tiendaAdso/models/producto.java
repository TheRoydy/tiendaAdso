package com.example.tiendaAdso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="producto")

public class producto {
	
	/*
	 id_producto
	 nombre_producto
	 descripcion_producto
	 precio_producto
	 stock
	 categoria
	 */
	
	@Id
	@GeneratedValue(strategy =GenerationType.UUID)
	@Column(name="id_producto", nullable=false, length = 36)
	private String id_producto;
	
	
	@Column(name="nombre_producto", nullable=false, length = 20)
	private String nombre_producto;
	
	
	@Column(name="descripcion_producto", nullable=false, length = 20)
	private String descripcion_producto;
	
	
	@Column(name="precio_producto", nullable=false, length = 20)
	private float precio_producto;
	
	
	@Column(name="stock", nullable=false, length = 20)
	private int stock;
	
	
	@Column(name="categoria", nullable=false, length = 20)
	private String categoria;


	public producto() {
		super();
	}


	public producto(String id_producto, String nombre_producto, String descripcion_producto, float precio_producto,
			int stock, String categoria) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion_producto = descripcion_producto;
		this.precio_producto = precio_producto;
		this.stock = stock;
		this.categoria = categoria;
	}


	public String getId_producto() {
		return id_producto;
	}


	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	public String getDescripcion_producto() {
		return descripcion_producto;
	}


	public void setDescripcion_producto(String decripcion_producto) {
		this.descripcion_producto = decripcion_producto;
	}


	public float getPrecio_producto() {
		return precio_producto;
	}


	public void setPrecio_producto(float precio_producto) {
		this.precio_producto = precio_producto;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	

}
