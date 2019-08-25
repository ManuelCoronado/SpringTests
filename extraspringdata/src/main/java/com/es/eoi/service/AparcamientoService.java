package com.es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.eoi.entity.Aparcamiento;
import com.es.eoi.repository.IAparcamientoRepository;
@Service
public class AparcamientoService implements IAparcamientoService{
	@Autowired
	IAparcamientoRepository repository;
	@Override
	public List<Aparcamiento> getAparcamiento() {
		return this.repository.findAll();
	}

	@Override
	public Aparcamiento saveAparcamiento(Aparcamiento aparcamiento) {
		return this.repository.save(aparcamiento);
	}

	@Override
	public Aparcamiento getAparcamientoById(int id) {
		return this.repository.findById(Integer.toString(id)).get();
	}

}
