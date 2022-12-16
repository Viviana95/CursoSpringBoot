package com.viviCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="personas")
public class Persona {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PER_ID")
    
    private int codigo;
    
    @Column(name="PER_NOMBRE", length = 50)
	private String nombre;
    
    
	public Persona() {}
	public Persona(int pCodigo, String pNombre) {
		
		codigo = pCodigo;
		nombre = pNombre;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
