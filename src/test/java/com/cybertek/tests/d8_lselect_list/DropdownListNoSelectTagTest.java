package com.cybertek.tests.d8_lselect_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownListNoSelectTagTest {


    @Test
    public void test() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");


        WebElement dropdownlink = driver.findElement(By.id("dropdownMenuLink"));

        dropdownlink.click();

        List<WebElement> options = driver.findElements(By.className("dropdown-item"));
        System.out.println("options.size() = " + options.size());

        for (WebElement each : options) {
            System.out.println(each.getText());
        }

        driver.findElement(By.linkText("Yahoo")).click();
        driver.quit();
    }

    @Test
    public void Bootstrap() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");


        WebElement boot = driver.findElement(By.id("menu1"));

        boot.click();

        List<WebElement> strap = driver.findElements(By.xpath("//ul[@class='dropdown-menu test']/li"));
        System.out.println("strap.size() = " + strap.size());
       strap.forEach(x->System.out.println(x.getText()));
//        for (WebElement each : strap) {
//            System.out.println(each.getText());
//        }

        driver.findElement(By.linkText("About Us")).click();
        driver.quit();
    }


}