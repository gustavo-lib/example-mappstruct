package com.gortiz.mapperStruct.mapper;

import org.mapstruct.Mapper;

import com.gortiz.mapperStruct.dto.EmpleadoDTO;
import com.gortiz.mapperStruct.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	//con atributos de distintos nombre
	
	
	Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
	
	EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

}
