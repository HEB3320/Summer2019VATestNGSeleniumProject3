package com.cybertek.tests.d6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");
        WebElement element = driver.findElement(By.cssSelector("button#disappearing_button"));

        System.out.println(element.getText());








    }
}
