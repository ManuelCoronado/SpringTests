package com.es.eoi.service;

import java.util.List;

import com.es.eoi.entity.Mecanico;
import com.es.eoi.entity.Reparacion;
import com.es.eoi.entity.Vehiculo;

public interface IReparacionService {
	public void save(Reparacion reparacion);
	
	public List<Reparacion> findAll();
	
	public List<Reparacion> getByPrice();

	public Reparacion findById(int id);
	
	public Vehiculo findByMatricula(String matricula);
	
	public Mecanico findByDni(String dni);
	
	public void remove(int id);
}
