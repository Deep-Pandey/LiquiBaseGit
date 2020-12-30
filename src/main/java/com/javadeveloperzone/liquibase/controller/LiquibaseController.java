package com.javadeveloperzone.liquibase.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
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
	
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
	
}
