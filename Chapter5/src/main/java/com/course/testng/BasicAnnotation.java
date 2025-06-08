package com.course.testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicAnnotation {

    // we can run single test or the class
    @Test
    public void testCase1(){
        System.out.println("testNG case1");

    }

    @Test
    public void testCase2(){
        System.out.println("testNG case2");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after test");
    }
}
