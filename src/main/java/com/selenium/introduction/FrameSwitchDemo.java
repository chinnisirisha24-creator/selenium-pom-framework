package com.selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameSwitchDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		pause();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		//Locate the iframe on the main page 
		WebElement frameElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mce_0_ifr")));
		
		//switch to iframe
		
		driver.switchTo().frame(frameElement);
		driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(0);
		System.out.println("Successfully switched into iFrame");
		pause();
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
	}

}
