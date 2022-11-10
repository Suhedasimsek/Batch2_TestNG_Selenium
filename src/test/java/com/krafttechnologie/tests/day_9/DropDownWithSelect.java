package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownWithSelect {
    //TAGİNDE SELECT VARSA BUNU UYGULUYORUZ
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
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement dropDownElement= driver.findElement(By.cssSelector("#oldSelectMenu"));

        Select selectMenu=new Select(dropDownElement);
        String expectedOption="Red";
        String actualOption=selectMenu.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption,expectedOption,"FAİLED");

        selectMenu.selectByVisibleText("Black");
        expectedOption="Black";
        actualOption=selectMenu.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption, expectedOption, "Failed");

        Thread.sleep(2000);
        selectMenu.selectByIndex(6);
        expectedOption="White";
        actualOption=selectMenu.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption,expectedOption,"failed");

        Thread.sleep(2000);
        selectMenu.selectByValue("3");
        expectedOption="Yellow";
        actualOption=selectMenu.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption,expectedOption,"failed");

        }
    }

