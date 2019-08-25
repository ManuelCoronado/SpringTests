package com.es.eoi.service;

import java.util.List;

import com.es.eoi.entity.Aparcamiento;


public interface IAparcamientoService {
	public List<Aparcamiento> getAparcamiento();
	public Aparcamiento saveAparcamiento(Aparcamiento aparcamiento);
	public Aparcamiento getAparcamientoById(int id);
}
