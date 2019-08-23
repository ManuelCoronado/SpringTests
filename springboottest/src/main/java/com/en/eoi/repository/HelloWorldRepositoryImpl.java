package com.en.eoi.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{
	
	public String helloWorld() {
		return "Hello World!";
	}
}
