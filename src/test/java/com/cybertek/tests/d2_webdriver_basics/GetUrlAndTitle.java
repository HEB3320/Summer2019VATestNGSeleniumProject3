package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetUrlAndTitle {
    public static void main(String[] args) {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        // open chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com/");

        // get the title of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);

        // getCurrentUrl(); --> gets url of this page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        // getPageSource --> get
//        String pageSource = driver.getPageSource();
//        System.out.println("pageSource = " + pageSource);
//        get all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url1 = link.getAttribute("href");
            System.out.println(url1);
        }
        driver.quit();
    }

}
