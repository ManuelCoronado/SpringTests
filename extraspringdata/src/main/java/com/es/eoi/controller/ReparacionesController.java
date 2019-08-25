package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.dto.ReparacionDto;
import com.es.eoi.entity.Mecanico;
import com.es.eoi.entity.Reparacion;
import com.es.eoi.entity.Vehiculo;
import com.es.eoi.service.IReparacionService;

@RestController
public class ReparacionesController {
	@Autowired
	IReparacionService service;
	
	@GetMapping("/reparacion/all")
	public List<Reparacion> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/reparacion/{id}")
	public Reparacion findReparacion(@PathVariable String id) {
		return this.service.findById(Integer.parseInt(id));
	}
	
	@GetMapping("/reparacion/vehiculo/{id}")
	public Vehiculo findReparacionVehiculo(@PathVariable String matricula) {
		return this.service.findByMatricula(matricula);
	}
	
	@GetMapping("/reparacion/mecanico/{id}")
	public Mecanico findReparacionMecanico(@PathVariable String dni) {
		return this.service.findByDni(dni);
	}

	@PostMapping("/reparacion")
	public void updateReparacion(@RequestBody ReparacionDto reparacion) {	
		Reparacion entity= new Reparacion();	
		BeanUtils.copyProperties(reparacion, entity);		
		
		this.service.save(entity);
	}

	@DeleteMapping("/reparacion/{id}")
	public void deleteReparacion(@PathVariable String id) {
		this.service.remove(Integer.parseInt(id));
	}

	
}
