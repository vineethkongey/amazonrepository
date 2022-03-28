package com.ecommerce.amazon.searchTest;

import org.testng.annotations.Test;

public class SearchBarTest {
	
	
	@Test
	public void enterValuesTest(){
		System.out.println("entered values successfully");
	}
	@Test
	public void groceryTest() {
		System.out.println("entered grocery values");
	}
	
	@Test
	public void mobileTest() {
		System.out.println("enteed mobile values");
	}
	@Test
	public void loginCredentials() {
		String BROWSER = System.getProperty("browser");	
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
		
		}
}