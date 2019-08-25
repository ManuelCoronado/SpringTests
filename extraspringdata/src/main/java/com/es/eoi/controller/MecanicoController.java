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
import com.es.eoi.entity.Mecanico;
import com.es.eoi.service.MecanicoService;

@RestController
public class MecanicoController {
	@Autowired
	MecanicoService service;
	
	@GetMapping("/mecanico")
	public List<Mecanico> findAllMecanico(){
		return this.service.getMecanicos();
	}

	@GetMapping("/mecanico/{id}")
    public Mecanico findMecanico(@PathVariable String dni) {   
    	return this.service.getMecanicoByDni(dni);
    }
	
    @PostMapping("/mecanico")
    public Mecanico createMecanico(Mecanico mecanico) {     	
    	return this.service.saveMecanico(mecanico);
    }
    
    @PutMapping("/mecanico")
	public void updateBanco(@RequestBody MecanicoDto mecanico) {
		Mecanico entity = new Mecanico();  
		BeanUtils.copyProperties(mecanico,entity);
		this.service.saveMecanico(entity);
	}
    
    @DeleteMapping("/mecanico/{id}")
    public void deleteMecanico(String dni) {
    	this.service.deleteMecanico(dni);
    }
    
    
}
