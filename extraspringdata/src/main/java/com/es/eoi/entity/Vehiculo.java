package com.es.eoi.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity(name = "VEHICULOS")
public class Vehiculo {
	
	@Id
	private String matricula;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	private List<Reparacion> reparaciones;
}
