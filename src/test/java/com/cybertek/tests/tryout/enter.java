package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class enter {

    public static void main(String[] args) {
        WebDriver driver  = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("iphone"+ Keys.ENTER);
    }
}
