package com.cybertek.tests.tryout;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTest {

    @Test
    public void test1(){

        System.out.println("I am inside in Test 1");
    }
    @Test
    public void test2(){

        System.out.println("I am inside in Test 2");
      //  int a = 1/0;
    }
    @Test (retryAnalyzer =RetryAnalyzer.class)
    public void test3(){

        System.out.println("I am inside in Test 3");
        Assert.assertTrue(0>1,"Yanlis");
    }



}
