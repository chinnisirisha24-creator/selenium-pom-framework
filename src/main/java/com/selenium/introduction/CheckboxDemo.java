package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		System.out.println("Checkbox page opened");
		pause();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println("Initially selected: " + checkbox1.isSelected());
		pause();
		if(!checkbox1.isSelected())
		{
			checkbox1.click();
			System.out.println("First checkbox selected");
		}
		
		pause();
		
		if(checkbox1.isSelected())
		{
			checkbox1.click();
			System.out.println("First checkbox deselected");
		}
		pause();
		System.out.println("selected after deselecting: "+ checkbox1.isSelected());
		driver.quit();
		System.out.println("Browser closed");
		

	}
	
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }

}
