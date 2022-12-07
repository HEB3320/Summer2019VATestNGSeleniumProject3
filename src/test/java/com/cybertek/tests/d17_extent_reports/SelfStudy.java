package com.cybertek.tests.d17_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelfStudy {

@Test
public static void selftry () throws InterruptedException {
    ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extentReportsAylin.html");
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
// creates a toggle for the given test, adds all log events under it
        ExtentTest logger = extent.createTest("MyFirstTest", "Sample description");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        logger.log(Status.INFO,"status check");
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Automation"+ Keys.ENTER);

        logger.pass("Entered text in searchbox");
        logger.info("Entered text in searchbox");
        logger.fail("Entered text in searchbox");
        driver.findElement(By.cssSelector(".pkt1Wd.byDyWd")).click();
        logger.pass("clicked on sound");

        driver.close();
        logger.pass("driver closed");
        extent.flush();




}
 }