package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Mecanico;
import com.es.eoi.repository.IMecanicoRepository;

@Service
public class MecanicoService implements IMecanicoService{
	
	@Autowired
	IMecanicoRepository repository;
	
	@Override
	public List<Mecanico> getMecanicos() {
		return this.repository.findAll();
	}

	@Override
	public Mecanico saveMecanico(Mecanico mecanico) {
		return this.repository.save(mecanico);
	}

	@Override
	public void deleteMecanico(String matricula) {
		this.repository.deleteById(matricula);
		
	}

	@Override
	public Mecanico getMecanicoByDni(String dni) {
		return this.repository.findBydni(dni);
	}

	@Override
	public Mecanico updateMecanico(Mecanico mecanico) {
		return this.repository.save(mecanico);
	}

}
