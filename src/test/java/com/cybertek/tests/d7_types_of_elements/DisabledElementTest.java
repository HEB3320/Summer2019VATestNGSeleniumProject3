package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement green = driver.findElement(By.id("green"));
        System.out.println("is element enabled: " + green.isEnabled());
        green.click();

        driver.get("https://practice.cydeo.com/dynamic_controls");
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

        System.out.println("is element enabled: " + input.isEnabled());

//        input.sendKeys("engin");

    }

}
