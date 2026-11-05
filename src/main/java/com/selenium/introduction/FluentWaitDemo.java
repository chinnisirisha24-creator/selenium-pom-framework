package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.NoSuchElementException;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Login page opened");
		pause();
		
		//configure fluent wait 
		FluentWait<WebDriver> wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		
		//wait until username field is visible
		WebElement username = wait.until(d -> {WebElement element = d.findElement(By.id("username"));
		if(element.isDisplayed())
		{
			return element;
		}
		return null;
		});
		username.sendKeys("tomsmith");
		System.out.println("username entered");
		pause();
		
		driver.quit();
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }

}
