package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selfstudy {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.com/joinIntro.php");

        System.out.println(driver.getTitle());
        //  driver.navigate().to("https://cybertekschool.com/joinIntro.php");
        // driver.get("https://amazon.com");
        Thread.sleep(1000);
        driver.navigate().to("https://amazon.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

        // WebDriver driver = WebDriverFactory.getDriver("chrome")

    }

}
