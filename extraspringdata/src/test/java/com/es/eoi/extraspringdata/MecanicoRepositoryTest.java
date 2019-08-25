package com.es.eoi.extraspringdata;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.es.eoi.entity.Mecanico;
import com.es.eoi.repository.IMecanicoRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@TestPropertySource("classpath:application.properties")
public class MecanicoRepositoryTest {

	@Autowired
	IMecanicoRepository repository;

	@Test	
	public void testCreate() {
		Mecanico mecanico = new Mecanico();
		mecanico.setCiudad("Alicante");
		mecanico.setDni("82253783X");
		mecanico.setNombre("Luis");
		mecanico.setSalario(800);
		assertNotNull(this.repository.save(mecanico));
	}


}
