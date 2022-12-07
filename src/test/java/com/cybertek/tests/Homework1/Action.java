package com.cybertek.tests.Homework1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface Action {


    public static void main(String[] args) {
        //open browser. I used utility for this.
        WebDriver driver  = WebDriverFactory.getDriver("chrome");

        // to go to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");

        // Used webElement class to find username box element
        WebElement username = driver.findElement(By.name("_username"));
        // entered valid credential to username box
        username.sendKeys("user154");

        // Used webElement class to find password box element
        WebElement password = driver.findElement(By.name("_password"));
        // entered valid credential to password box
        password.sendKeys("UserUser123");

        // Used webElement class to find login button element
        WebElement login = driver.findElement(By.id("_submit"));
        // click on login button
        login.click();

        Actions action =new Actions(driver);
       WebElement activities = driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[2]/following-sibling::li/a/span"));
      //  "//a[contains(text(),'Acti')]"
        action.moveToElement(activities).perform();

        WebElement calenderEvents =driver.findElement(By.xpath("//ul/li[@data-route='oro_calendar_event_index']/a"));
action.moveToElement(calenderEvents).click().build().perform();

    }

}
