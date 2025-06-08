package com.course.testng.groups;

import org.testng.annotations.Test;

public class group2 {
    @Test(groups = "InGroup")
    public void groupTest2(){
        System.out.println("this is test group2");
    }
}
