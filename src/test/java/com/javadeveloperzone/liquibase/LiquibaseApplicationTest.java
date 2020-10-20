package com.javadeveloperzone.liquibase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javadeveloperzone.liquibase.controller.LiquibaseController;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LiquibaseApplicationTest {

	@Autowired
	LiquibaseController liquibaseController;
	
	   @Test
	   public void whenIntIsProvided_thenSumIsCorrect() {
	      //Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
	      //String testName = orderService.getProductName();
		  int sum = liquibaseController.sum(5, 6);
	      Assert.assertEquals(11, sum);
	   }
	
	
}
