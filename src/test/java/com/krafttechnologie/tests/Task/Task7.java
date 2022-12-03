package com.krafttechnologie.tests.Task;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.Driver;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task7 {
    /*https://the-internet.herokuapp.com/dropdown Links to an external site.sitesine git
Dropdown List den Option 2 yi sectir.
tps://demoqa.com/checkbox sitesine git
Home klasorunu ac.
Desktop ve Download klasorlerini check yaptir
Check yapildigini da verify yaptir*/
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
    public void test7() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDownElement = driver.findElement(By.id("dropdown"));

        Select selectMenu = new Select(dropDownElement);
        Thread.sleep(2000);
        selectMenu.selectByVisibleText("Option 2");


       driver.get("https://demoqa.com/checkbox");
       Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title='Toggle']")).click();
WebElement desktop= driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
desktop.click();
        System.out.println("desktop.isSelected() = " + desktop.isSelected());
        //Assert.assertTrue(desktop.isSelected(), "failed");
        Thread.sleep(2000);
WebElement download= driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
download.click();

       //Assert.assertTrue(download.isSelected(), "failed");
    }
}


