package com.cybertek.tests;


import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Aadsafdsafdas");

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());

        System.out.println(faker.chuckNorris().fact());


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");


        WebElement abc = driver.findElement(By.name("q"));
        abc.sendKeys("Engine");
    }
}
