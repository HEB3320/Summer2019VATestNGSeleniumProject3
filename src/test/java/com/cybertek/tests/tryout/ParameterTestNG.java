package com.cybertek.tests.tryout;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {






   @Parameters("Engin")
   @Test
    public void test1 (String name)  {
        System.out.println("test name is: "+name);


    }









}
