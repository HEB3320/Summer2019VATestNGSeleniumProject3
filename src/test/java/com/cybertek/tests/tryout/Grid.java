package com.cybertek.tests.tryout;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid<URl> {

    @Test
    public void test1() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.WINDOWS);

        URL url = new URL("http://localhost:4444/wd/hub");
        WebDriver driver =new RemoteWebDriver(url,desiredCapabilities);
        driver.get("http://learn-automation.com");
        System.out.println("Title is " + driver.getTitle());
driver.quit();

    }


}
