package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task2 {
    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. Checkboxes kutusundan sadece option 1  ve 4 u sec

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
    public void Test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement dropDownElement = driver.findElement(By.cssSelector("[value='option-3']"));
        dropDownElement.click();
        Thread.sleep(3000);
        WebElement dropDownElement1 = driver.findElement(By.cssSelector("[value='option-1']"));
        dropDownElement1.click();
        Thread.sleep(3000);
        WebElement dropDownElement4 = driver.findElement(By.cssSelector("[value='option-4']"));
        dropDownElement4.click();

        //2.yol

        List<WebElement> Options=driver.findElements(By.xpath("//input[@type='checkbox']"));

        Thread.sleep(2000);


        if(!Options.get(0).isSelected()){
            Options.get(0).click();

        }if(!Options.get(3).isSelected()){
            Options.get(3).click();
        }if(Options.get(2).isSelected()){
            Options.get(2).click();
        }


    }
    }

