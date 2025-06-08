package com.course.testng.groups;

import org.testng.annotations.Test;

public class group3 {

    @Test(groups = "outGroup")
    public void groupTest3(){
        System.out.println("this is test group3");
    }
}
