package com.es.eoi.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class MecanicoDto {
	
	private String dni;

	private String nombre;

	private String ciudad;
	
	private float salario;
	
	@Column
	private AparcamientoDto aparcamiento;

//	private Set<UserDto> referencesTo;
//	
//	private Set<UserDto> referencesFrom;
//	
//	Set<Message> posts;	
	
//	Set<Event> events;
	
}
