package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    WebDriver driver;
    @BeforeMethod
    public void self (){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



    }






}
