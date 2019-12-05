package com.cybertek.tests.tryout;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class switchWindowAssignment {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        String parent = driver.getWindowHandle();
        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();
        Set<String> all = driver.getWindowHandles();
        System.out.println(all.size());

        for (String each: all){
            if (all.equals(parent)){
                continue;
            }
            driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.close();

        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());









    }
}
