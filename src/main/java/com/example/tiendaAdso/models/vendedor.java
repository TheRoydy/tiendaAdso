package com.example.tiendaAdso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="vendedor")

public class vendedor {
	
	/*
	 id_vendedor
	 primer_nombre
	 primer_nombre
	 primer_apellido
	 segundo_apellido
	 correo
	 telefono
	 dirreccion
	 */
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.UUID)
	@Column(name="id_vendedor", nullable=false, length = 36)
	private String id_vendedor;
	
	
	@Column(name="primer_nombre", nullable=false, length = 20)
	private String primer_nombre;
	
	
	@Column(name="segundo_nombre", nullable=true, length = 20)
	private String segundo_nombre;
	
	
	@Column(name="primer_apellido", nullable=false, length = 20)
	private String primer_apellido;
	
	
	@Column(name="segundo_apellido", nullable=true, length = 20)
	private String segundo_apellido;
	
	
	@Column(name="telefono", nullable=false, length = 15)
	private String telefono;
	
	
	@Column(name="correo", nullable=false, length = 200)
	private String correo;
	
	
	@Column(name="direccion", nullable=false, length = 100)
	private String direccion;


	public vendedor() {
		super();
	}


	public vendedor(String id_vendedor, String primer_nombre, String segundo_nombre, String primer_apellido,
			String segundo_apellido, String telefono, String correo, String direccion) {
		super();
		this.id_vendedor = id_vendedor;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
	}


	public String getId_vendedor() {
		return id_vendedor;
	}


	public void setId_vendedor(String id_vendedor) {
		this.id_vendedor = id_vendedor;
	}


	public String getPrimer_nombre() {
		return primer_nombre;
	}


	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}


	public String getSegundo_nombre() {
		return segundo_nombre;
	}


	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}


	public String getPrimer_apellido() {
		return primer_apellido;
	}


	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}


	public String getSegundo_apellido() {
		return segundo_apellido;
	}


	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
