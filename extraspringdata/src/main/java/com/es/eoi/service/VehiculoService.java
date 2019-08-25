package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Vehiculo;
import com.es.eoi.repository.IVehiculoRepository;

@Service
public class VehiculoService implements IVehiculoService{
	@Autowired
	IVehiculoRepository repository;

	@Override
	public List<Vehiculo> getVehiculos() {
		return this.repository.findAll();
	}

	@Override
	public Vehiculo saveVehiculo(Vehiculo vehiculo) {
		return this.repository.save(vehiculo);
	}

	@Override
	public void deleteVehiculo(String matricula) {
		this.repository.deleteById(matricula);
		
	}

	@Override
	public Vehiculo getVehiculoByMatricula(String matricula) {
		return this.repository.findBymatricula(matricula);
	}

	@Override
	public Vehiculo updateVehiculo(Vehiculo vehiculo) {
		return this.repository.save(vehiculo);
	}
	
}
