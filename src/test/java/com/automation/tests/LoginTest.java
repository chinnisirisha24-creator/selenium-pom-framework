package com.automation.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.automation.pages.LoginPage;


public class LoginTest {
	
	WebDriver driver;
	LoginPage _loginPage;


@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
	
	//Create page object
	_loginPage = new LoginPage(driver);
}

@Test
public void validLoginTest()
{
	_loginPage.login("tomsmith", "SuperSecretPassword!");
	String actualMessage = _loginPage.getMessage();
	Assert.assertTrue(actualMessage.contains("You logged into a secure area!"), "Login was unsuccessful");
	
}

@Test
public void invalidLoginTest()
{
	_loginPage.login("wronguser", "Super");
	String actualMessage = _loginPage.getMessage();
	Assert.assertTrue(actualMessage.contains("Your username is invalid!"), "Login was successful");
	
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}


