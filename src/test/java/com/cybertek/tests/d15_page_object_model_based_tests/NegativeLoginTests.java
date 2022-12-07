package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests  {
    WebDriver driver;
    @Test
    public void wrongPasswordTest(){
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
        driver.get("https://qa1.vytrack.com/user/login");
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("greatpassword");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://qa1.vytrack.com/user/login");
        LoginPage loginPage =new  LoginPage();
        loginPage.userName.sendKeys("superadminuser");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }
}
                                    