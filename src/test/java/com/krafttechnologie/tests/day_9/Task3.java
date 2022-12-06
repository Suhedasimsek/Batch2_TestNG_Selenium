package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task3 {
    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. Radio Button  kutusundaki elementlerin sayisini bul ve tum elementleri yazdir
    3. Blue elementini sec

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

       // List<WebElement> Elements = driver.findElements(By.xpath("//h2"));
       List<WebElement> Elements = driver.findElements(By.xpath("//input[@type='radio'][@name='color']"));
        System.out.println("Elements.size() = " + Elements.size());
        //Elements.get(1).click();
        for (WebElement Element:Elements) {
            System.out.println("Element = " + Element.getAttribute("value"));
        }
        if (!Elements.get(1).isSelected()){
            Elements.get(1).click();
        }
    }
}
