package com.course.testng.exception;

import org.testng.annotations.Test;

public class exceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionTest(){
        System.out.println("this is exception test");
        throw new RuntimeException();

    }
}
