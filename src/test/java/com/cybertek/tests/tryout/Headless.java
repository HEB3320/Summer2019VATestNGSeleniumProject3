package com.cybertek.tests.tryout;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {


    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("abcd"+ Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
        driver.quit();
        System.out.println("Test completed");













    }

}
