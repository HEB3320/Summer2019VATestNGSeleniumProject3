package com.cybertek.tests.o1_intellij_shortcuts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfstudy2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
       driver.get("http://practice.cybertekschool.com/");
   //     String title = driver.getTitle();
  //      System.out.println("title = " + title);
  //      String url = driver.getCurrentUrl();
   //     System.out.println("url = " + url);
  //      Thread.sleep (1000);
   //     driver.close();

       driver= new ChromeDriver();
        driver.get("http://amazon.com");
        Thread.sleep(5000);
        driver.close();

    }
}