package com.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class VehiculoDto {
	
	private String matricula;

	private String marca;

	private String modelo;
	
//	private Set<UserDto> referencesTo;
//	
//	private Set<UserDto> referencesFrom;
//	
//	Set<Message> posts;	
	
//	Set<Event> events;
	
}
