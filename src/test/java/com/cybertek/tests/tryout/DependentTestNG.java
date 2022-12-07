package com.cybertek.tests.tryout;

import org.testng.annotations.Test;

public class DependentTestNG {





    @Test(dependsOnMethods = "test2")
    public void test1() throws InterruptedException {

        System.out.println("Test 1 passed");
    }

    @Test
    public void test2() throws InterruptedException {

        System.out.println("Test 2 passed");
    }

    @Test(priority =-1)
    public void test3() throws InterruptedException {

        System.out.println("Test 3 passed");
    }
}
