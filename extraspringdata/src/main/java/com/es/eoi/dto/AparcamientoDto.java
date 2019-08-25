package com.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class AparcamientoDto {
	
	private int id;

	private String fila;

	private String columna;

//	private Set<UserDto> referencesTo;
//	
//	private Set<UserDto> referencesFrom;
//	
//	Set<Message> posts;	
	
//	Set<Event> events;
	
}
