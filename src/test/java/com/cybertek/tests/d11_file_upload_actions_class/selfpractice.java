package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selfpractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\engin\\Desktop\\file (1).txt");
Thread.sleep(3000);
driver.findElement(By.id("file-submit")).click();


    }
}
