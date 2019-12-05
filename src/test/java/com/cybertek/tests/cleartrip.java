package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class cleartrip {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.cleartrip.com/");
        WebElement element1 = driver.findElement(By.id("Adults"));
        Select select = new Select(element1);
        select.selectByIndex(4);
        Thread.sleep(2000);

        WebElement element2 = driver.findElement(By.id("Childrens"));
        select = new Select(element2);
        select.selectByValue("3");


        select = new Select(driver.findElement(By.id("Infants")));
        select.selectByIndex(3);

        driver.findElement(By.xpath("//strong[.=' More options:']")).click();
        select = new Select(driver.findElement(By.xpath("//select[@id='Class']")));
        select.selectByValue("Business");
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("American Airline");


        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();

        driver.findElement(By.id("FromTag")).sendKeys("new");
        Thread.sleep(2000);

        driver.findElement(By.id("SearchBtn")).click();

        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

           }
}