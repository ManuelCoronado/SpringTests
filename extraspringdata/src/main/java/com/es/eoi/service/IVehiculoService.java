package com.es.eoi.service;

import java.util.List;

import com.es.eoi.entity.Vehiculo;

public interface IVehiculoService {
	
	public List<Vehiculo> getVehiculos();
	public Vehiculo saveVehiculo(Vehiculo vehiculo);
	public void deleteVehiculo(String matricula);
	public Vehiculo getVehiculoByMatricula(String matricula);
	public Vehiculo updateVehiculo(Vehiculo vehiculo);
}
