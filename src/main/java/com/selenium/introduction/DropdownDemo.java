package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		System.out.println("dropdown page opened");
		
		//locate the dropdown
		WebElement dropdownElement=driver.findElement(By.id("dropdown"));
		
		// create select object
		Select dropdown=new Select(dropdownElement);
		
		//select by visible text
		dropdown.selectByVisibleText("Option 1");
		System.out.println("Selected by Text : Option 1");
		pause();
		
		//select by value
		dropdown.selectByValue("2");
		System.out.println("Selected by value : 2");
		pause();
		
		//select by index
		//index 0 is the placeholder;
		dropdown.selectByIndex(1);
		System.out.println("Selected by index : 1");
		pause();
		
		//read the selected option
		WebElement selectedOption=dropdown.getFirstSelectedOption(); 
		System.out.println("Currently selected option: "+selectedOption.getText()); 
		pause();
		
		driver.quit();
		
		

	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }


}
