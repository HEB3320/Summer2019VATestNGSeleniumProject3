package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.Open browser
 * 2.Go to https://google.com
 * 3.Search for one of the strings the list search Strs given below
 * 4.In the results pages, capture the url right below the first results
 * 5.Click on the first result
 * 6.Verify that url is equal to the value from step 4
 * 7.Navigate back8.Repeat the same steps for all search items in the
 * listList<String> searchStrs = Arrays.asList("Java", "JUnit", "Selenium");
 */
public class google {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
               driver.get("https://www.google.com");
      //
        List<String> searchStrs = Arrays.asList("Java", "JUnit", "Selenium");

       WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
        String str = searchStrs.get(2);
        search.sendKeys(str+ Keys.ENTER);
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//cite[.='https://www.seleniumhq.org']"));
        String actual = element.getText();
        System.out.println(actual);
        element.click();
        String expected = driver.getCurrentUrl();
        System.out.println(expected);
        Thread.sleep(2000);
        driver.navigate().back();

       if (actual.equals(expected))
           System.out.println("PASS");
       else {
           System.out.println("FAIL");
           System.out.println("expected = " + expected);
           System.out.println("actual = " + actual);
       }




    }

}
