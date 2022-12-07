package com.cybertek.tests.tryout;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {


    public static void main(String[] args) throws InterruptedException {


        DesiredCapabilities capabilities =new DesiredCapabilities();
       // capabilities.setCapability("ignoreProtectedModeSettings",true);
       // capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.google.com/");

                WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://google.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("abcd");
        driver.quit();
    }




}
