package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Wikipedia {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver"+ Keys.ENTER);
        driver.findElement(By.linkText("Selenium (software)")).click();
        String url = driver.getCurrentUrl();
        String search = "Selenium_(software)";

        if (url.endsWith(search)) {
            System.out.println("PASS");
        }
            else {
                System.out.println("FAIL");
                System.out.println("search = " + search);
                System.out.println("url = " + url);
            }
        }



    }



