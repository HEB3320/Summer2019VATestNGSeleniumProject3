package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/sign_up");

driver.manage().window().maximize();
        WebElement fullname =driver.findElement(By.name("full_name"));

        Faker faker = new Faker();
        fullname.sendKeys(faker.name().fullName());

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement submitbutton = driver.findElement(By.name("wooden_spoon"));
        submitbutton.click();



    }
}
