package com.course.testng;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore test");
    }
}
