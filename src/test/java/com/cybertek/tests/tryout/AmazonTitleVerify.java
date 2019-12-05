package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonTitleVerify {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);
        String actual= driver.getTitle();
        String search = "iphone";

        if ( actual.contains(search))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("search = " + search);
            System.out.println("actual = " + actual);
        }


    }
}
