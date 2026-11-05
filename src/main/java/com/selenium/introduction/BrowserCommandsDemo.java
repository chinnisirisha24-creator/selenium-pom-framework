package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Step 1: Open the home page
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Home page opened");
        pause();

        // Step 2: Get the page title
        System.out.println("Title: " + driver.getTitle());
        pause();

        // Step 3: Navigate to the login page
        driver.navigate().to(
                "https://the-internet.herokuapp.com/login");
        System.out.println("Login page opened");
        pause();

        // Step 4: Navigate back
        driver.navigate().back();
        System.out.println("Navigated back");
        pause();

        // Step 5: Navigate forward
        driver.navigate().forward();
        System.out.println("Navigated forward");
        pause();

        // Step 6: Refresh the page
        driver.navigate().refresh();
        System.out.println("Page refreshed");
        pause();

        driver.quit();
        System.out.println("Browser closed");
    }

    public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }
}