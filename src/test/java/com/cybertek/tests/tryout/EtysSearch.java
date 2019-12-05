package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Etsy search test
 * 1.Open browser
 * 2.Go to https://ebay.com
 * 3.Search for wooden spoon
 * 4.Save the total number of results
 * 5.Click on link All
 * 6.Verify that number of results is bigger than the number in step 4
 * 7.Navigate back to previous research results page
 * 8.Verify that wooden spoon is displayed in the search box
 * 9.Navigate back to home page
 * 10.Verify that search box is blank
 */
public class EtysSearch {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");
        WebElement search = driver.findElement(By.xpath("//input[@*='300']"));

        search.sendKeys("wooden spoon" + Keys.ENTER);

        String number4 = driver.findElement(By.xpath("//div/h1/span")).getText();
        String y = number4.replace(",", "");


        System.out.println(y);
        //  int n4 = Integer.parseInt(number4);
        driver.findElement(By.xpath("//div/ul/li/a/span")).click();
        Thread.sleep(5000);
        String number6 = driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText();
        String z = number6.replace(",", "");
        System.out.println(z);

        int a = Integer.valueOf(y);
        System.out.println(a);

        int b = Integer.valueOf(z);
        System.out.println(b);

        if (b>a){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("b = " + b);
            System.out.println("a = " + a);;
        }
    driver.navigate().back();
        String vrf = driver.findElement(By.id("gh-ac")).getAttribute("value");


      if (vrf.equals("wooden spoon"))
          System.out.println("PASS");
      else{
          System.out.println("FAIL");


      }
      Thread.sleep(3000);
driver.navigate().back();
     String fnl = driver.findElement(By.name("_nkw")).getText();

     if (fnl.isEmpty())
         System.out.println("PASS");
else {
         System.out.println("FAIL");
     }


    }
}
