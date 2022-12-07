package com.cybertek.tests.tryout;

import com.cybertek.tests.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT2  {


    @DataProvider
    public Object[][] data() {

        String[][] str = {
                {"Engin", "12", "A"}, {"Aylin", "123","B"}, {"Arin", "1234","C"}
        };

        return str;
    }

    @Test(dataProvider = "data")
    public void test1(String username, String password, String domain) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
       WebDriver driver =new ChromeDriver();
        driver.get("https://login.cbh2.crediblebh.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("UserName")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("DomainName")).sendKeys(domain);
        Thread.sleep(2000);
        driver.quit();

    }



    }


