package com.cybertek.tests.d8_lselect_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElementsTest {

    @Test
    public void test1 (){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");
        List<WebElement> buttons =driver.findElements(By.tagName("button"));
        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(),6);

        for (WebElement button:buttons) {
        //   System.out.println(button);
            System.out.println(button.getText());
        }

    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("utton"));
        System.out.println(buttons.size());

    }



}
