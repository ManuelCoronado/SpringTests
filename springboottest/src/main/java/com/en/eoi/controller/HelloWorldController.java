package com.en.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.en.eoi.services.HelloWorldService;

@Controller
public class HelloWorldController {
	@Autowired
	HelloWorldService service;
}
