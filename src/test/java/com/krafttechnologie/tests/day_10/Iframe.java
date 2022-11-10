package com.krafttechnologie.tests.day_10;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframe {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void iframe() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");


        // how to switch the frame

        // first way using NAME or ID
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.cssSelector("#tinymce"));
        textArea.clear();
        Thread.sleep(2000);
        textArea.sendKeys("Batch 2 was here");

        //second way switching INDEX
        driver.switchTo().parentFrame();// first we should go back to parent
        driver.switchTo().frame(0);
        textArea.clear();
        textArea.sendKeys("Batch 2 was here Two times");


        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        // third way using WEB ELEMENT
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        textArea.clear();
        textArea.sendKeys("This is third way");


    }
}