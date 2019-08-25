package com.es.eoi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "REPARACION")
public class Reparacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private Date fechaReparacion;
	
	@Column
	private float precioReparacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mecanico_dni", referencedColumnName = "dni")
	private Mecanico mecanico;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehiculo_matricula", referencedColumnName = "matricula")
	private Vehiculo vehiculo;

	
}
