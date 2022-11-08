package com.krafttechnologie.tests.day_8;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isEnabled {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() {
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox3 = driver.findElement(By.xpath("//label[@for='gridCheck3']"));
        System.out.println(checkBox3.isEnabled());
        WebElement checkBox2 = driver.findElement(By.xpath("//label[@for='gridCheck2']"));
        System.out.println(checkBox2.isEnabled());


    }
}
