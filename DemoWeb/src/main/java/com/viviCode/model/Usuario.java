package com.viviCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int codigo;
    
	@Column(name="CLAVE", length = 255)
	private String clave;
	
    
    @Column(name="PER_NOMBRE", length = 255)
	private String nombre;
    
    
    
	public Usuario() {
		
	}
	public Usuario(int codigo, String clave, String nombre) {
		
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
