package com.es.eoi.extraspringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.es.eoi")
@EntityScan( basePackages = {"com.es.eoi"} )
@ComponentScan(basePackages = "com.es.eoi")
@EnableAutoConfiguration

public class ExtraspringdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtraspringdataApplication.class, args);
	}

}
