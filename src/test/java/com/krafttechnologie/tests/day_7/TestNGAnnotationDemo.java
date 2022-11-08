package com.krafttechnologie.tests.day_7;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
    @BeforeMethod
    public void setUp() {
        System.out.println("Open Browser");
    }

    @Test
    public void Test1() {
        System.out.println("First Test First Assertion");
        Assert.assertEquals("title", "title");
        System.out.println("First Test Second Assertion");
        Assert.assertEquals("url", "url");
    }

    @Test
    public void Test2() {
        System.out.println("Second Test First Assertion");
        Assert.assertEquals("test2", "test2");

    }

    @Test
    public void Test3() {
        String expectedTitle = "Draft";
        String actualTitle = "Kraftech";
        Assert.assertTrue(actualTitle.contains(expectedTitle), "verify that title starting Kraft");

    }

    @Test
    public void Test4() {

        String eMail = "kraftTechnologie@gmail.com";
       // Assert.assertTrue((eMail.contains("@l")), "failed");
        if (eMail.contains("@")) {
            System.out.println("Pass");
        } else System.out.println("Failed");
    }

    @Test
    public void test5(){

        Assert.assertFalse(0>1,"verify that = is not greater than 1");

    }

    @Test
    public void test6(){
        Assert.assertNotEquals("two","one");
    }


        @AfterMethod
    public void tearDown (){
        System.out.println("Close Browser");
    }
}
