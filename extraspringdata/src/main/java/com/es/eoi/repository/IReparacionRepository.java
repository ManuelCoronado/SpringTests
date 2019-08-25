package com.es.eoi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.es.eoi.entity.Mecanico;
import com.es.eoi.entity.Reparacion;
import com.es.eoi.entity.Vehiculo;

@Repository
public interface IReparacionRepository extends JpaRepository<Reparacion, Integer>{
	public Vehiculo findByvehiculo_matricula(String matricula_vehiculo);
	public Mecanico findBymecanico_dni(String mecanico_dni);
	@Query(value = "select * from reparacion order by cast(precio_reparacion as DECIMAL(10,5))", nativeQuery = true)
	public List<Reparacion>getReparacionByPrice();
}
