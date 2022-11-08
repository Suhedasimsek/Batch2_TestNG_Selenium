package com.krafttechnologie.tests.Tasks;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task5 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test() {
        driver.get("https://www.krafttechexlab.com/forms/radio");
        WebElement radio1 = driver.findElement(By.cssSelector("#gridRadios1"));
        WebElement radio2 = driver.findElement(By.cssSelector("#gridRadios2"));
        System.out.println(radio1.isSelected());
        System.out.println(radio2.isSelected());
        Assert.assertTrue(radio1.isSelected(), "FAİLED");
        Assert.assertFalse(radio2.isSelected(), "FAİLED");
        radio2.click();
        Assert.assertFalse(radio1.isSelected(), "FAİLED");
        Assert.assertTrue(radio2.isSelected(), "FAİLED");
    }
}
