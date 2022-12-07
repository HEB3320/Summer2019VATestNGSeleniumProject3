package com.cybertek.tests.listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {


    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart: "+result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess: "+result.getName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure"+result.getName());
    }



    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped"+result.getName());
    }


    public void onStart(ITestContext context) {
      //  System.out.println("onStart"+context.getName());
    }

    /**
     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
     * and all their Configuration methods have been called.
     */
    public void onFinish(ITestContext context) {
        System.out.println("onFinish"+context.getName());
    }

}
