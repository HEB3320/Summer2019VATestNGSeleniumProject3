package com.cybertek.tests.Homework2;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VtrackNegative {

         /**
          •Go to the login page of VyTrack
          •Enter invalidcredential (can be any role)
          •Click login button
          •Verify that the system shows error message “Invalid user name or password.”
         */

        public static void main(String[] args) {

            //open browser. I used utility for this.
            WebDriver driver  = WebDriverFactory.getDriver("chrome");

            // to go to https://qa2.vytrack.com/user/login
            driver.get("https://qa2.vytrack.com/user/login");

            // Used webElement class to find username box element
            WebElement username = driver.findElement(By.name("_username"));

            Faker faker =new Faker();
            // entered valid credential to username box
            username.sendKeys(faker.name().username());

            // Used webElement class to find password box element
            WebElement password = driver.findElement(By.name("_password"));
            // entered valid credential to password box
            password.sendKeys (faker.internet().password());

            // Used webElement class to find login button element
            WebElement login = driver.findElement(By.id("_submit"));
            // click on login button
            login.click();


            String actualtext = driver.findElement(By.xpath("//div[contains(text(),'Invalid user name or password.')]")).getText();
            String expectedText ="Invalid user name or password.";

            System.out.println(actualtext);
            System.out.println(expectedText);

            if (expectedText.equals(actualtext)) {
                System.out.println("PASS");
            }
          else {
               System.out.println("FAIL");

                System.out.println("expectedText = " + expectedText);
                System.out.println("actualtext = " + actualtext);



            }



        }



    }
