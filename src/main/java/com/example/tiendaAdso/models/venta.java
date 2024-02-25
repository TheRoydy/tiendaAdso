package com.example.tiendaAdso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="Venta")

public class venta {
	
	/*
	 id_venta
	 fecha_venta
	 total_venta
	 tipo_pago
	 */
	
	@Id
	@GeneratedValue(strategy =GenerationType.UUID)
	@Column(name="id_venta", nullable=false, length = 36)
	private String id_venta;
	
	@ManyToOne
	@JoinColumn(name="id")
	private cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_vendedor")
	private vendedor vendedor;
	
	@Column(name="fecha_venta", nullable=false, length = 30)
	private String fecha_venta;
	
	
	@Column(name="total_venta", nullable=false, length = 30)
	private float total_venta;
	
	
	@Column(name="tipo_pago", nullable=false, length = 30)
	private String tipo_pago;


	public venta() {
		super();
	}


	public venta(String id_venta, com.example.tiendaAdso.models.cliente cliente,
			com.example.tiendaAdso.models.vendedor vendedor, String fecha_venta, float total_venta, String tipo_pago) {
		super();
		this.id_venta = id_venta;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.fecha_venta = fecha_venta;
		this.total_venta = total_venta;
		this.tipo_pago = tipo_pago;
	}


	public String getId_venta() {
		return id_venta;
	}


	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}


	public cliente getCliente() {
		return cliente;
	}


	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}


	public vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public String getFecha_venta() {
		return fecha_venta;
	}


	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}


	public float getTotal_venta() {
		return total_venta;
	}


	public void setTotal_venta(float total_venta) {
		this.total_venta = total_venta;
	}


	public String getTipo_pago() {
		return tipo_pago;
	}


	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	
	

}
