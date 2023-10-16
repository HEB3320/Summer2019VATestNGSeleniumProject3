package com.cybertek.tests.d1_basic_navigation;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class NavigationDemo {
    public static <Int> void main(String[] args) throws InterruptedException {

//        int abc = 2;
//        System.out.println(++abc);
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//driver.manage().deleteAllCookies();
//driver.manage().window().maximize();
//        // driver.getTitle() --> returns the title of the page
//        System.out.println(driver.getTitle());
//
//
//        // this is not from selenium, it is from java
//        // it pauses the program
//        Thread.sleep(1000);
//
//
//        driver.navigate().to("https://amazon.com/");
//        System.out.println(driver.getTitle());
//
//        Thread.sleep(1000);
//          driver.navigate().back() --> goes back to previous page
//      driver.navigate().back();
//        System.out.println(driver.getTitle());
//
//        Thread.sleep(1000);
//        //  driver.navigate().forward() --> goes forward after going back
//        driver.navigate().forward();
//        System.out.println(driver.getTitle());
//
//        Thread.sleep(1000);
//        //  driver.navigate().refresh() --> reloads the current page
//        driver.navigate().refresh();
//        System.out.println(driver.getTitle());
//        driver.close();


//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver1 = new FirefoxDriver();
//
//        driver1.get("https://amazon.com/");
        String tt = "hello engin bekem bekem engin";
String [] arr = tt.split(" ");
        System.out.println(Arrays.toString(arr));
String fnl="";
for (int i=0;i<arr.length;i++){

//    fnl+= StringUtils.capitalize(arr[i])+ " ";
    fnl += arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+ " ";
}

        System.out.println(fnl);

      int[] abc = {1,4,3,1,5,2,5};
        Arrays.stream(abc).distinct().forEach(x->System.out.println(x));
       String[] arr1 = StringUtils.removeDuplicateStrings(arr);
        System.out.println(Arrays.toString(arr1));

//        0,1,1,2,3,5,8,13,21,34

        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);

        for (int i=0;i<10;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }System.out.println("");
        System.out.println(".............Addition...........");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        int tr =0;
        for (int i =0; i<integers.size();i++){
            tr+=integers.get(i);
        }
        System.out.println(tr);
    }


}
