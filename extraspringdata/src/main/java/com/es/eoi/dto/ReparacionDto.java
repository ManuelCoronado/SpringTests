package com.es.eoi.dto;

import java.sql.Date;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReparacionDto {
	@Column
	private int id;
	
	@Column
	private Date fechaReparacion;
	
	@Column
	private float precioReparacion;
	
	@Column
	private MecanicoDto mecanico;
	
	@Column
	private VehiculoDto vehiculo;
}
