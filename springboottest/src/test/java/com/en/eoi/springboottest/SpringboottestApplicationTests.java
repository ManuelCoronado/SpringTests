package com.en.eoi.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.en.eoi.services.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringboottestApplicationTests {
	@Autowired
	private HelloWorldService service;
	@Test
	public void contextLoads() {
		System.out.println(service.helloWorld());
	}
}
