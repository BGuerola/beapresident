package com.bepresident.model;


import com.bepresident.repo.Constants;
import com.bepresident.repo.Constants.Raza;
import com.bepresident.repo.Constants.Sexo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.bepresident.repo.Constants.Partits;

@Entity
public class Candidat {
		
	@Id
	private int id;
	private String nombre;
	private Constants.Partits afiliacion;
	private Constants.Sexo sexo;
	private Constants.Raza raza;
	private int edad;
	private String ciudad;
	
	public Candidat(int id, String nombre, Partits afiliacion, Sexo sexo, Raza raza, int edad, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.afiliacion = afiliacion;
		this.sexo = sexo;
		this.raza = raza;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Constants.Partits getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(Constants.Partits afiliacion) {
		this.afiliacion = afiliacion;
	}

	public Constants.Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Constants.Sexo sexo) {
		this.sexo = sexo;
	}

	public Constants.Raza getRaza() {
		return raza;
	}

	public void setRaza(Constants.Raza raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Candidat [nombre=" + nombre + ", afiliacion=" + afiliacion + ", sexo=" + sexo + ", raza=" + raza
				+ ", edad=" + edad + ", ciudad=" + ciudad + "]";
	}
	
	

}
