package com.cybertek.tests.Homework3;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class translate {


        public static void main(String[] args) {


            WebDriver driver  = WebDriverFactory.getDriver("chrome");

                       driver.get("https://translate.google.com");

            WebElement anyLanguage = driver.findElement(By.id("source"));

            anyLanguage.sendKeys("amigo");

          String text =driver.findElement(By.xpath("//body/iframe/following-sibling::div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/span")).getText();
            System.out.println(text);



        }



    }

