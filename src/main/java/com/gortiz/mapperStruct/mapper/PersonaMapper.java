package com.gortiz.mapperStruct.mapper;

import org.mapstruct.Mapper;

import com.gortiz.mapperStruct.dto.PersonaDTO;
import com.gortiz.mapperStruct.model.Persona;

@Mapper
public interface PersonaMapper {
	
	Persona personaDTOToPersona(PersonaDTO personaDTO);
	
	PersonaDTO personaToPersonaDTO(Persona persona);

}
