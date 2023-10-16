package com.cybertek.tests.d6_testng;

import org.testng.annotations.*;


public class BeforeAfterTests {


    @Test (groups = {"regression"})
    public void test1() {

        System.out.println("this is test one");
    }

    @Test(priority = 1)
    public void test2() {

        System.out.println("this is test two");
    }
    @BeforeClass
//        @BeforeMethod
                public void  setupMethod() {
            System.out.println("Before Method");
            System.out.println("Opening Chrome");
        }
        @AfterClass
//            @AfterMethod
            public void  teardownMethod() {
                System.out.println("After Method");
                System.out.println("Closing Chrome");

            }




    }
