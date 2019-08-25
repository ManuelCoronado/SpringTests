package com.es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.eoi.entity.Aparcamiento;

@Repository
public interface IAparcamientoRepository extends JpaRepository<Aparcamiento, String>{

}
