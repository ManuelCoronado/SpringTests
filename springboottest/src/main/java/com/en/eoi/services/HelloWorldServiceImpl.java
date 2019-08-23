package com.en.eoi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en.eoi.repository.HelloWorldRepository;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{
	@Autowired
	HelloWorldRepository repository;
	
	public String helloWorld() {
		return this.repository.helloWorld();
	}
}
