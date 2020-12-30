package com.javadeveloperzone.liquibase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	/*
	 * @Test public void firstSearchResultIsRelatedTest() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "src/test/resources/drivers/chromedriver.exe"); // <-- Change this path
	 * WebDriver driver = new ChromeDriver(); // String baseUrl =
	 * "https://experitest.com/free-trial/"; String baseUrl =
	 * "http://10.0.75.1:8080/"; String expectedTitle = "Selenium Testing";
	 * 
	 * String actualTitle = ""; driver.get(baseUrl); actualTitle =
	 * driver.getTitle(); System.out.println("title is : "+driver.getTitle());
	 * System.out.println("actualTitle : "+actualTitle); // Check that the page
	 * title contains the term "Software Testing"
	 * Assert.assertTrue(actualTitle.contains(expectedTitle));
	 * 
	 * // Close the browser driver.quit(); }
	 */
}
