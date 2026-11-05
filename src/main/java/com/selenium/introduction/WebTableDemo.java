package com.selenium.introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		pause();
		
		//find all rows in the table
		
		List<WebElement> rows=driver.findElements(By.cssSelector("#table1 thead tr"));
		
		//find all headers
		List<WebElement> headers=driver.findElements(By.cssSelector("#table1 thead th"));
 
		
		//find all data cells 
		List<WebElement> data=driver.findElements(By.cssSelector("#table1 tbody td"));
		
		System.out.println("Total rows: " +rows.size());
		System.out.println("Total columns: "+headers.size());
		System.out.println("Data cells: "+data.size());
		
		//print all column headers
		for(WebElement header: headers)
		{
			System.out.println(header.getText() + " |");
		}
		
		WebElement firstCell = driver.findElement(By.cssSelector("#table1 tbody tr:first-child td:first-child"));
		System.out.println(firstCell.getText());
		//driver.quit();
		
		List<WebElement> personDetails = driver.findElements(By.cssSelector("#table1 tbody tr"));
		for(WebElement personDetail : personDetails)
		{
			if(personDetail.getText().contains("John"))
			{
				System.out.println("Matching row found:");
				System.out.println(personDetail.getText());
				break;
			}
		}
			driver.quit();
	}
	public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }

}
