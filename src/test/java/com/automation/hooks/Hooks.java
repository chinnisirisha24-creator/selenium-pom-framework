package com.automation.hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
	}

}
