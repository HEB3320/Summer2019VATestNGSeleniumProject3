package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaseEbaySearch {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");
        //driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("iphone x");

       driver.findElement(By.id("gh-btn")).click();

        String text = driver.findElement(By.className("srp-controls__count-heading")).getText();

        System.out.println(text);

    }
}
