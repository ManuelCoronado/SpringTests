package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.dto.MecanicoDto;
import com.es.eoi.dto.VehiculoDto;
import com.es.eoi.entity.Mecanico;
import com.es.eoi.entity.Vehiculo;
import com.es.eoi.service.VehiculoService;

@RestController
public class VehiculoController {
	@Autowired
	VehiculoService service;
	
	@GetMapping("/vehiculo/{id}")
	public Vehiculo findVehiculo(@PathVariable String matricula) {
		return this.service.getVehiculoByMatricula(matricula);
	}

	@PostMapping("/vehiculo")
	public void createVehiculo(@RequestBody VehiculoDto vehiculo) {	
		Vehiculo entity= new Vehiculo();	
		BeanUtils.copyProperties(vehiculo, entity);		
		this.service.saveVehiculo(entity);
	}

	@DeleteMapping("/vehiculo/{id}")
	public void deleteVehiculo(@PathVariable String matricula) {
		this.service.deleteVehiculo(matricula);
	}

	@GetMapping("/vehiculo")
	public List<Vehiculo> findAll() {
		return this.service.getVehiculos();
	}
	
	@PutMapping("/vehiculo/id")
	public void updateVehiculo(@RequestBody VehiculoDto vehiculo) {	
		Vehiculo entity= new Vehiculo();	
		BeanUtils.copyProperties(vehiculo, entity);		
		this.service.saveVehiculo(entity);
	}
}
