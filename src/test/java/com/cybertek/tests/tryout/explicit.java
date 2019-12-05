package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));

        System.out.println(driver.findElement(By.id("results")).getText());




    }
}
