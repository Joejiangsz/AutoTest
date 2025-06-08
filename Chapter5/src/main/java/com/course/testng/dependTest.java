package com.course.testng;

import org.testng.annotations.Test;

public class dependTest {
    @Test
    public void test1(){
        System.out.println("this is test1");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("this is test2");
    }
}
