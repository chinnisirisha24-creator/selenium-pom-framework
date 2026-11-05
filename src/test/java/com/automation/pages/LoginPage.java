package com.automation.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
	
	//Declare WedDriver
	WebDriver driver;
	
	//Locators
	By loginPageHeading= By.xpath("//h2[text()='Login Page']");
	By username = By.id("username");
	By password=By.id("password");
	By loginButton = By.cssSelector("button[type='submit']");
	By message = By.id("flash");
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
 
	//enter username
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	//enter password
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	//Click Login
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public String getMessage()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(message)).getText().trim();
	}
	
	//complete login operation
	public void login(String user, String pass)
	{
		enterUsername(user);
		enterPassword(pass);
		clickLoginButton();
	}
}
