package com.es.eoi.service;

import java.util.List;

import com.es.eoi.entity.Mecanico;

public interface IMecanicoService {
	public List<Mecanico> getMecanicos();
	public Mecanico saveMecanico(Mecanico mecanico);
	public void deleteMecanico(String dni);
	public Mecanico getMecanicoByDni(String dni);
	public Mecanico updateMecanico(Mecanico mecanico);
}
