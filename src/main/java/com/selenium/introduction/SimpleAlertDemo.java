package com.selenium.introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class SimpleAlertDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		pause();
		
		//click the button that opens a simple alert
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		simpleAlert.click();
		
		//switch to pop up 
		Alert alert = driver.switchTo().alert();
		
		//read the alert message
		
		String message = alert.getText();
		System.out.println("Alert message: "+message);
		pause();
		
		//Click ok
		alert.accept();
		System.out.println("Alert accepted");
		pause();
		
		driver.quit();
		

	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
	}	


}
