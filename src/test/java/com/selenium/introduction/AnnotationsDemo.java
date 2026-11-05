package com.selenium.introduction;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AnnotationsDemo {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
	}

	@Test
	public void loginTest()
	{
		System.out.println("Test Method");
		
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("After Method");
	}

	}

