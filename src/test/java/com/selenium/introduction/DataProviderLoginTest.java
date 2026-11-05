package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class DataProviderLoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData(){
		return new Object[][]{
			{"tomsmith", "SuperSecretPassword!", true},{"wronguser","wrongpassword", false},{"tomsmith", "wrongpassword", false}, {"wrongusername", "SuperSecretPassword!", false}
			};
			}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password, boolean validCredentials) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String message = driver.findElement(By.id("flash")).getText();
		if(validCredentials)
		{
			Assert.assertEquals(message.contains("You logged into a secure area!"), "Expected successful login for " + username);
		}
		else {
			Assert.assertTrue(message.contains("invalid"), "Expected an error message for "+username);
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
			
}
