package com.krafttechnologie.tests.Task;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task9 {
    /*https://www.krafttechexlab.com/forms/radio Links to an external site.sitesine git
    Radio 2 yi sectir.*/
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
    public void Task9() {
        driver.get("https://www.krafttechexlab.com/forms/radio");
        WebElement checkBox2 = driver.findElement(By.xpath("(//label[.='Radio 2'])[1]"));
        checkBox2.click();
        System.out.println(checkBox2.isSelected());
        //Assert.assertTrue(checkBox2.isSelected(), "FAİLED");
    }
}

