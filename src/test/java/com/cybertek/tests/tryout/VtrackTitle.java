package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

/*
1.Open browser
2.Go to Vytrack login page
3.Login as any user
4.Click on your name on top right
5.Click on  My Configuration
6.Verify that title start with the same name on top right
 */
public class VtrackTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("storemanager61");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'My Configuration')]")).click();
        Thread.sleep(3000);
        String ttl = driver.getTitle();
        System.out.println(ttl);
        String actual = driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).getText();

        if (ttl.startsWith(actual))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("ttl = " + ttl);
        }


    }
    }



