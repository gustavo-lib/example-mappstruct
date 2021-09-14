package com.gortiz.mapperStruct.dto;

public class EmpleadoDTO {
	
	private Integer id;
	private String nombreEmpleado;
	private LugarDTO sede;
	private String fechaIngreso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public LugarDTO getSede() {
		return sede;
	}

	public void setSede(LugarDTO sede) {
		this.sede = sede;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [id=" + id + ", nombreEmpleado=" + nombreEmpleado + ", sede=" + sede + ", fechaIngreso="
				+ fechaIngreso + "]";
	}


}
