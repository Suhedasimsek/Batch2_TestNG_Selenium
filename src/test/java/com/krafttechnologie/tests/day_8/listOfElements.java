package com.krafttechnologie.tests.day_8;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class listOfElements {
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
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        List<WebElement> buttons=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
        System.out.println(buttons.size());
        Assert.assertEquals(buttons.size(),4);
        for (WebElement button:buttons) {
            System.out.println(button.getText());
            System.out.println(button.isDisplayed());}
        Thread.sleep(3000);
        buttons.get(2).click();

        }
    }

