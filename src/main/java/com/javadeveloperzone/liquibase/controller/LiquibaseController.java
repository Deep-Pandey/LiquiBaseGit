package com.javadeveloperzone.liquibase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LiquibaseController {

	
	@GetMapping("/sum/{a}/{b}")
	public int sum(@PathVariable int a,@PathVariable int b)
	{
		int o = a+b;
		return o;
	}
	
	
}
