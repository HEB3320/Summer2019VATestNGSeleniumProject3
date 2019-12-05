package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/*
1.Open browser
2.Go to Vytrack login page
3.Login as a sales manager
4. Verify Dashboard page is open
5.Click on Shortcuts icon
6.Click on link See full list
7.Click on link Opportunities
8. Verify Open opportunities page is open
9.Click on Shortcuts icon
10.Click on link See full list
11.Click on link Vehicle Service Logs
12.Verify error message text is You do not have permission to perform this action.
13.Verify Shortcut Actions List page is still open
 */
public class VytrackShortcut {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("storemanager61");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.equals("Dashboard"))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='fa-share-square']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("See full list")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Opportunities")).click();
        Thread.sleep(2000);
        String abc= driver.getTitle();
        if (title.contains("Opportunities"))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
        }





    }
}
