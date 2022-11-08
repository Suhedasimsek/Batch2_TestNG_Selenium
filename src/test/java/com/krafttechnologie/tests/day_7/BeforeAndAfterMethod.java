package com.krafttechnologie.tests.day_7;

import org.testng.annotations.*;

public class BeforeAndAfterMethod {
    @BeforeClass
    public void setUpClass (){
        System.out.println("--Before Class--");
    }
    @Test
    public void Test1() {
        System.out.println("First test case");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method çalıştı");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method çalıştı");
    }

    @Test
    public void Test2() {
        System.out.println("Second test case");
    }
    @AfterClass
    public void closeClass (){
        System.out.println("--After Class--");
    }
}
