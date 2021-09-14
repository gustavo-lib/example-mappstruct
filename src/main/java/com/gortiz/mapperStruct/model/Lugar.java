package com.gortiz.mapperStruct.model;

public class Lugar {
	
	private Integer id;
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "SedeDTO [id=" + id + ", nombre=" + nombre + "]";
	}


}
