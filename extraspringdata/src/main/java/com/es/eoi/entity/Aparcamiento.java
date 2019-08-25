package com.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "APARCAMIENTOS")
public class Aparcamiento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String fila;
	
	@Column
	private String columna;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "aparcamiento")
	private Mecanico mecanico;
	
}
