package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	@Test(priority =2)
	public void ValidLoginTest()
	{
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		WebElement message = driver.findElement(By.id("flash"));
		Assert.assertTrue(message.getText().contains("bnvjhabk"), "Successfully login message was not displayed");	
	}
	
	@Test(priority=1)
	public void InValidLoginTest()
	{
		driver.findElement(By.id("username")).sendKeys("smith");
		driver.findElement(By.id("password")).sendKeys("tyuih!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		WebElement message = driver.findElement(By.id("flash"));
		Assert.assertTrue(message.getText().contains("bvxhsgxvjasv"), " login warning error was not displayed");	
	
	}
		
		
	
	
	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
