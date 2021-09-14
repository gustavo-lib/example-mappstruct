package com.gortiz.mapperStruct.dto;

public class EmpleadoDTO {
	
	private Integer id;
	private String nombreEmpleadoDTO;
	private LugarDTO sede;
	private String fechaIngreso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnombreEmpleadoDTO() {
		return nombreEmpleadoDTO;
	}

	public void setnombreEmpleadoDTO(String nombreEmpleadoDTO) {
		this.nombreEmpleadoDTO = nombreEmpleadoDTO;
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
		return "EmpleadoDTO [id=" + id + ", nombreEmpleadoDTO=" + nombreEmpleadoDTO + ", sede=" + sede + ", fechaIngreso="
				+ fechaIngreso + "]";
	}


}
