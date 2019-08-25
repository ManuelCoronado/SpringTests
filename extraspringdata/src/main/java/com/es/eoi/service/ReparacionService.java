package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Mecanico;
import com.es.eoi.entity.Reparacion;
import com.es.eoi.entity.Vehiculo;
import com.es.eoi.repository.IReparacionRepository;

@Service
public class ReparacionService implements IReparacionService {
	@Autowired
	IReparacionRepository repository;
	@Override
	public void save(Reparacion reparacion) {
		this.repository.save(reparacion);
	}

	@Override
	public List<Reparacion> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Reparacion findById(int id) {
		return this.repository.findById(id).get();
	}

	@Override
	public void remove(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public Vehiculo findByMatricula(String matricula) {
		return this.repository.findByvehiculo_matricula(matricula);
	}

	@Override
	public Mecanico findByDni(String dni) {
		return this.repository.findBymecanico_dni(dni);
	}

	@Override
	public List<Reparacion> getByPrice() {
		return this.repository.getReparacionByPrice();
	}

}
