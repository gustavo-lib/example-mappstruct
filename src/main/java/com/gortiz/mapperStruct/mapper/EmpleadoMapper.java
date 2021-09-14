package com.gortiz.mapperStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.gortiz.mapperStruct.dto.EmpleadoDTO;
import com.gortiz.mapperStruct.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	//con atributos de distintos nombre
	
	@Mappings({
		@Mapping(target = "nombre", source = "empleadoDTO.nombreEmpleado"),
		@Mapping(target = "fechaIngreso", source = "empleadoDTO.fechaIngreso", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
	
	EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

}
