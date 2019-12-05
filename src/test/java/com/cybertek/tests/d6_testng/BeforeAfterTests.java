package com.cybertek.tests.d6_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BeforeAfterTests {


    @Test
    public void test1() {
        System.out.println("this is test one");
    }

    @Test
    public void test2() {
        System.out.println("this is test two");
    }
        @BeforeMethod
                public void  setupMethod() {
            System.out.println("Before Method");
            System.out.println("Opening Chrome");
        }
            @AfterMethod
            public void  teardownMethod() {
                System.out.println("After Method");
                System.out.println("Closing Chrome");
            }




    }
