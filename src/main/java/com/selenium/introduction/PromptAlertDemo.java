package com.selenium.introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class PromptAlertDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 System.out.println("alert page opened");
		 pause();
		 
		 //open prompt alert 
		 WebElement promptalert=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		 promptalert.click();
		 System.out.println("prompt alert opened");
		 pause();
		 
		 //switch to alert
		 Alert alert123= driver.switchTo().alert();
		 
		 //read alert message
		 String message = alert123.getText();
		 System.out.println("alert message " + message);
		 pause();
		 
		//enter text in alert 
		 alert123.sendKeys("java selenium");
		 pause();
		 System.out.println("Text entered:");
		 pause();
		 
		 //Click ok
		 alert123.accept();
		 pause();
		 
		 //verify the result message 
		 String resultmessage= driver.findElement(By.id("result")).getText();
		 System.out.println("result message displayed:" + resultmessage);
		 pause();
		 
		 driver.quit();
		 
		 
		 }
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
	}	

}
