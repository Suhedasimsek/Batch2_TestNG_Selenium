package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDrownTask {
    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. DropDowns Menusunden SQL,TestNG ve CSS sec

     */
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
    public void Test() {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement dropDownElement= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
        Select selectMenu=new Select(dropDownElement);
        selectMenu.selectByVisibleText("SQL");


        WebElement dropDownElement2= driver.findElement(By.cssSelector("#dropdowm-menu-2"));
        Select selectMenu2=new Select(dropDownElement2);
        selectMenu2.selectByVisibleText("TestNG");



        WebElement dropDownElement3= driver.findElement(By.cssSelector("#dropdowm-menu-3"));
        Select selectMenu3=new Select(dropDownElement3);
        selectMenu3.selectByVisibleText("CSS");


    }
}