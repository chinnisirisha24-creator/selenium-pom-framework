package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Login page opened");
		pause();
		
		//create an explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		
		//wait for username field to become visible
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.sendKeys("tomsmith");
		System.out.println("username entered");
		pause();
		
		//wait for password field to become visible
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("SuperSecretPassword!");
		System.out.println("password entered");
		pause();
		
		//wait until login button is visible
		WebElement loginButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='radius']")));
		loginButton.click();
		System.out.println("clicked login button");
		pause();
		
		//wait until the result message visible
		WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
		System.out.println("Result: "+ message.getText());
		pause();
		
		driver.quit();
		
		
		
	}
	
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }


}
