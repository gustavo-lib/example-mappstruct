package com.gortiz.mapperStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.gortiz.mapperStruct.dto.EmpleadoDTO;
import com.gortiz.mapperStruct.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	//con atributos de distintos nombre
	//dto-->entity
	@Mappings({
		@Mapping(target = "nombreEmpleado", source = "empleadoDTO.nombreEmpleadoDTO"),
		@Mapping(target = "fechaIngreso", source = "empleadoDTO.fechaIngreso", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
	
	
	//entity-->dto
	@Mappings({// de la class EmpleadoDTO por el atributo nombreEmpleadoDTO tomael valor de la fuente class Empleado.nombreEmpleado 
		@Mapping(target = "nombreEmpleadoDTO", source = "empleado.nombreEmpleado"),
		@Mapping(target = "fechaIngreso", source = "empleado.fechaIngreso", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

}
