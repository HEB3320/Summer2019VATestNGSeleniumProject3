package com.cybertek.tests.listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListeners.class)
public class TestNGListenersDemo1 {
    @Test
public void test1(){

    System.out.println("This is test 1");
}
    @Test
    public void test2(){

        System.out.println("This is test 2");
    }
    @Test
    public void test3(){

        System.out.println("This is test 3");
    }

}
