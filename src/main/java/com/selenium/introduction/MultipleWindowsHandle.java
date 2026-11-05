package com.selenium.introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;
public class MultipleWindowsHandle {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//open URL
		driver.get("https://the-internet.herokuapp.com/windows");
		pause();
		
		//save the parent window handle
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window saved." +parentWindow);
		
		//Click link to open new window
		driver.findElement(By.linkText("Click Here")).click();
		pause();
		System.out.println("Clicked on link");
		
		//Wait until window opens
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2)); 
		
		//Get all open windows handles
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Total windows: "+allWindows.size());
		
		//find and switch to the child window
		for(String window : allWindows)  
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				break;
			}
				
		}
		pause();
		
		//read information from the child window
		System.out.println("Child page title: "+driver.getTitle());
		WebElement heading = driver.findElement(By.tagName("h3"));
		System.out.println("Child page heading: "+heading.getText());
		pause();
		
		//close the child window
		driver.close();
		
		//switch to parent frame
		driver.switchTo().window(parentWindow);
		System.out.println("Parent page title: "+driver.getTitle());
		pause();
		
		//close the entire browser session
		driver.quit();
		
	}
	
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }

}
