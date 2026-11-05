package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        // Locate username and password fields
        WebElement username =
                driver.findElement(By.id("username"));

        WebElement password =
                driver.findElement(By.id("password"));
        System.out.println("ID - Locator");
        
        //2,. Name Locator
        
        WebElement password2 = driver.findElement(By.name("password"));
        System.out.println("Name locator");
        
        
        //3. Tag name
        int inputCount = driver.findElements(By.tagName("input")).size();
        System.out.println("tag name - count" + inputCount);

       // 4. class name 
        WebElement loginButton = driver.findElement(By.className("radius"));
        System.out.println("Classname - locator");
        
        //5. Link Text Locator 
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement Link = driver.findElement(By.linkText("Form Authentication"));
        System.out.println("Link Text - locator");
        
        //6. Partial Link Text Locator
        WebElement partialLink = driver.findElement(By.partialLinkText("Authentication"));
        System.out.println("partial Link Text - locator");
        
        //7. CSS Selector
        //driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement csslink=driver.findElement((By.cssSelector("//a[href='/login']")));
        System.out.println("CSS Selector");
        
        //8. XPath
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement xpathLink=driver.findElement(By.xpath("//a[text()='Form Authentication']"));
        
        driver.quit();
    }
    public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }
}