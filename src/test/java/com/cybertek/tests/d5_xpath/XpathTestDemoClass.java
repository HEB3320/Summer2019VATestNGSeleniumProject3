package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestDemoClass {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/h3"));

        System.out.println(link.getText());


    }
}
