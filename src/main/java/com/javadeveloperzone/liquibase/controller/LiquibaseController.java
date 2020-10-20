package com.javadeveloperzone.liquibase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LiquibaseController {

	
	@GetMapping
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	
}
