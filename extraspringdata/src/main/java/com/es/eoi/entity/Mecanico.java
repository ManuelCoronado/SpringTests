package com.es.eoi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "MECANICOS")
public class Mecanico {
	
	@Id
	private String dni;
	
	@Column
	private String nombre;
	
	@Column
	private String ciudad;
	
	@Column
	private float salario;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mecanico")
	private List<Reparacion> reparaciones;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aparcamiento_id", referencedColumnName = "id")
    private Aparcamiento aparcamiento;
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "aparcamiento_mecanico", 
//      joinColumns = { @JoinColumn(name = "mecanico_dni", referencedColumnName = "dni") },
//      inverseJoinColumns = { @JoinColumn(name = "aparcamiento_id", referencedColumnName = "id") })
//    private Aparcamiento aparcamiento;
}
