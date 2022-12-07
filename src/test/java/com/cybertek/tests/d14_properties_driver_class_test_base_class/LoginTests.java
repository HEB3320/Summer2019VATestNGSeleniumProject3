package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests  {

    @Test
    public void login() {
       String url = ConfigurationReader.get("url");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.get(url);

        WebElement element =driver.findElement(By.id("prependedInput"));


        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);
        driver.quit();
    }
}
