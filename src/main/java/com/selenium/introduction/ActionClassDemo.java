package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//create actions object
		Actions actions= new Actions(driver);
		
		driver.get("https://the-internet.herokuapp.com/login");
		pause();
		
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.cssSelector("button[type='submit']"));
		
		actions.sendKeys(username, "tomsmith").perform();
		actions.sendKeys(password, "SuperSecretPassword!").perform();
		actions.click(loginButton).perform();
		pause();
		
		//demonstrating house over 
		driver.get("https://the-internet.herokuapp.com/hovers");
		pause();
		
		WebElement firstFigure = driver.findElement(By.cssSelector(".figure"));
		//mouse hovering on elemnt
		actions.moveToElement(firstFigure).perform();
		
		pause();
		 //Double Click
		
		actions.doubleClick(firstFigure).perform();
		System.out.println("Double clicking on elemnt");
		pause();
		
		//Right click
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		pause();
		WebElement hotspot = driver.findElement(By.id("hot-spot"));
		actions.contextClick(hotspot).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		pause();
		
		
		
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }


}
