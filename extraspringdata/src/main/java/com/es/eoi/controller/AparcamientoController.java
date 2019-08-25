package com.es.eoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.eoi.entity.Aparcamiento;
import com.es.eoi.service.AparcamientoService;

@RestController
public class AparcamientoController {
	@Autowired
	AparcamientoService service;
    
	@GetMapping("/aparcamiento")
	public List<Aparcamiento> findAllAparcamiento(){
		return this.service.getAparcamiento();
	}
	
	@GetMapping("/aparcamiento/{id}")
    public Aparcamiento findAparcamiento(@PathVariable String id) {   
    	return this.service.getAparcamientoById(Integer.parseInt(id));
    }
	
    @PostMapping("/aparcamiento")
    public Aparcamiento createAparcamiento(Aparcamiento aparcamiento) {     	
    	return this.service.saveAparcamiento(aparcamiento);
    }
	
}
