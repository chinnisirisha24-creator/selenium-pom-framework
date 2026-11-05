package com.selenium.introduction;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadiobuttonDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/radio_buttons");
		System.out.println("Radio button page opened");
		pause();
		// select blue
		WebElement blueRadiobutton=driver.findElement(By.id("blue"));
		blueRadiobutton.click();
		//verify blue selection
		System.out.println("Blue selected: " + blueRadiobutton.isSelected());
		pause();
		
		// select red
		WebElement redRadiobutton=driver.findElement(By.id("red"));
		redRadiobutton.click();
		//verify red selection
		System.out.println("Red selected: " + redRadiobutton.isSelected());
		
		pause();
		
		// select green
				WebElement greenRadiobutton=driver.findElement(By.id("green"));
				greenRadiobutton.click();
				//verify green selection
				System.out.println("Green selected: " + greenRadiobutton.isSelected());
				
		pause();
		
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }

}
