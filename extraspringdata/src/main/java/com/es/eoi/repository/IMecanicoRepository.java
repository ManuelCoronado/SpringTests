package com.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.eoi.entity.Mecanico;

@Repository
public interface IMecanicoRepository extends JpaRepository<Mecanico, String>{
	public Mecanico findBydni(String dni);
}
