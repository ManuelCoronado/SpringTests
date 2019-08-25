package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.entity.Reparacion;
import com.es.eoi.service.ReparacionService;

@RestController
public class InformesController {
	@Autowired
	ReparacionService service;
	
	@GetMapping("/informes/ventasOrderByPriceDesc")
	public List<Reparacion> getOrederedVentas(){
		return this.service.getByPrice();
	}
}
