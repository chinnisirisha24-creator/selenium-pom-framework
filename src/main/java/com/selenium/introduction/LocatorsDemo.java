package com.selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open the login page
        driver.get("https://the-internet.herokuapp.com/login");
        pause();

        // 1. ID Locator
        WebElement usernameById =
                driver.findElement(By.id("username"));
        pause();

        System.out.println(
                "ID - Username displayed: "
                + usernameById.isDisplayed());

        // 2. Name Locator
        WebElement passwordByName =
                driver.findElement(By.name("password"));
        pause();

        System.out.println(
                "Name - Password displayed: "
                + passwordByName.isDisplayed());

        // 3. Class Name Locator
        WebElement usernameByClass =
                driver.findElement(By.className("radius"));
        pause();

        System.out.println(
                "Class Name - Button displayed: "
                + usernameByClass.isDisplayed());

        // 4. Tag Name Locator
        int inputCount =
                driver.findElements(By.tagName("input")).size();
        pause();

        System.out.println(
                "Tag Name - Number of input elements: "
                + inputCount);

        // Open home page for link locators
        driver.get("https://the-internet.herokuapp.com/");

        // 5. Link Text Locator
        WebElement loginLink =
                driver.findElement(By.linkText("Form Authentication"));
        pause();

        System.out.println(
                "Link Text - Link displayed: "
                + loginLink.isDisplayed());

        // 6. Partial Link Text Locator
        WebElement partialLink =
                driver.findElement(By.partialLinkText("Authentication"));
        pause();

        System.out.println(
                "Partial Link Text - Link displayed: "
                + partialLink.isDisplayed());

        // 7. CSS Selector
        WebElement cssLink =
                driver.findElement(
                        By.cssSelector("a[href='/login']"));
        pause();

        System.out.println(
                "CSS Selector - Link displayed: "
                + cssLink.isDisplayed());

        // 8. XPath
        WebElement xpathLink =
                driver.findElement(
                        By.xpath("//a[@href='/login']"));
        pause();

        System.out.println(
                "XPath - Link displayed: "
                + xpathLink.isDisplayed());

        driver.quit();
    }
    

    public static void pause() throws InterruptedException {
        Thread.sleep(3000);
    }
}