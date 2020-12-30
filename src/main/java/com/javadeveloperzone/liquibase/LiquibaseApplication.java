package com.javadeveloperzone.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LiquibaseApplication extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(LiquibaseApplication.class);
	 }

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseApplication.class, args);
	}
}
