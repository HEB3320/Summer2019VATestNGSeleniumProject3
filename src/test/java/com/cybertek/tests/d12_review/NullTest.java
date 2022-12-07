package com.cybertek.tests.d12_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NullTest {

    String string;



    @BeforeMethod
    public void setupMethod() {

       string = null;


    }


    @Test
    public void test() {

        System.out.println(string.toLowerCase());
        Assert.assertNull(string);


    }


}
