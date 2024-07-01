package com.afk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AjaxCallDemo {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Setup WebDriver using WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();

        // Step 2: Initialize the Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Step 3: Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        try {
            // Step 4: Navigate to the specified URL
            driver.get("http://omayo.blogspot.com/");

            // Step 5: Locate the dropdown button using XPath and click it to reveal the dropdown menu
            driver.findElement(By.xpath("//button[normalize-space()='Dropdown']")).click();

            // Step 6: Initialize WebDriverWait with a timeout of 10 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Step 7: Wait until the Facebook link is visible in the dropdown menu
            WebElement elementFacebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Facebook']")));

            // Step 8: Click the Facebook link once it is visible
            elementFacebook.click();
        } finally {
            // Step 9: Introduce a 2-second delay for demonstration purposes
            Thread.sleep(2000);

            // Step 10: Close the browser and quit the WebDriver
            driver.quit();
        }
    }
}
