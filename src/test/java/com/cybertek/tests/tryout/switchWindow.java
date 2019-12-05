package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class switchWindow {
    private String title;

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://support.google.com/");

        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//span[.='Google']//span")).click();

        Set <String> all = driver.getWindowHandles();
        System.out.println(driver.getTitle());
        System.out.println(all.size());


        for (String each: all){
            if (all.equals(parent)){
                continue;
            }
            driver.switchTo().window(each);
        }
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());








    }
}