package com.cybertek.tests.Homework1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VtrackAutomation {
    /**
     * •Go to the login page of VyTrack
     * •Enter valid credential (can be any role)
     * •Click login button
     * •Verify that the user login successfully
     */

    public static void main(String[] args) {

        //open browser. I used utility for this.
        WebDriver driver  = WebDriverFactory.getDriver("chrome");

        // to go to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");

        // Used webElement class to find username box element
        WebElement username = driver.findElement(By.name("_username"));
        // entered valid credential to username box
        username.sendKeys("storemanager61");

        // Used webElement class to find password box element
        WebElement password = driver.findElement(By.name("_password"));
        // entered valid credential to password box
        password.sendKeys("UserUser123");

        // Used webElement class to find login button element
        WebElement login = driver.findElement(By.id("_submit"));
        // click on login button
        login.click();

        // the expected url is https://qa2.vytrack.com
        String expectedUrl ="https://qa2.vytrack.com";
        // verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");

            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }



    }




}
