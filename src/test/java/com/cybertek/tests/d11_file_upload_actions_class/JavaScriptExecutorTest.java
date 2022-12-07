package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void click() {
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        // this how the JavascriptExecutor object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // executeScript --> method used to pass js command
        // first string argument is the javascript code
        // second argument is the webelement on which the action will be taken
        jse.executeScript("arguments[0].click();", element);

    }

    @Test
    public void type() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("input[disabled]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String str = "hello";

//        element.sendKeys(str);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].setAttribute('value', '" + str + "')", element);

    }

    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 5; i++) {
            jse.executeScript("scroll(0, 500);");
            Thread.sleep(2000);

        }

    }

    @Test
    public void credibaleBh() {

        driver.get(("https://login.cbh2.crediblebh.com/"));
        driver.findElement(By.id("UserName")).sendKeys("HayriBekem");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.id("DomainName")).sendKeys("LHCTHBS");
        driver.findElement(By.id("btnLogin")).click();
        String hh = driver.findElement(By.xpath("//i[contains(text(),'User name and/or password do not match')]")).getText();
        System.out.println(hh);


        //  Assert.assertEquals("User name and/or password do not match",);
    }

    @Test
    public void date() {

        driver.get(("https://www.spicejet.com/"));
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();


    }

@Test (enabled = true)
    public void scrolll() throws InterruptedException {
        driver.get("https://www.amtrak.com/acela-train");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 15; i++) {
            jse.executeScript("scroll(0, 1700);");
            Thread.sleep(2000);

            // how to scroll to bottom of page
            // select an element at the bottom and find coordinates
            //int x = element.getLocation().getX();
            // int y = element.getLocation().getY();
            // System.out.println(x);
            //System.out.println(y);
            // JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy("+x+","+y+")");
            // Thread.sleep(3000);
            // element.click();

        }

    }















}