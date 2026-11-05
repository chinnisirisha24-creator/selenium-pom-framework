package com.selenium.introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//set implicit wait to 10 seconds 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Login page opened");
		pause();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		System.out.println("username enterd");
		pause();
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		System.out.println("password entered");
		pause();
		
		driver.quit();
		System.out.println("driver closed");
		
		
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
	}	

}
