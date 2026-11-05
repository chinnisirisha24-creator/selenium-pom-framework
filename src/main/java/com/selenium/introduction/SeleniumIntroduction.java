package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
       pause();

        System.out.println("Selenium started successfully");

        driver.quit();
    }
    public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    } 
    
}