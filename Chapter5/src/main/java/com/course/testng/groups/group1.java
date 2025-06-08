package com.course.testng.groups;

import org.testng.annotations.Test;

public class group1 {
    @Test(groups = "InGroup")
    public void groupTest1(){
        System.out.println("this is test group1");
    }
}
