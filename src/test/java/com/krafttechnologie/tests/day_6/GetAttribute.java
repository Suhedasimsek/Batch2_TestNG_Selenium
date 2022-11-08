package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        String email="mike@gmail.com";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        driver.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(2000);
        
        String value=driver.findElement(By.id("email")).getAttribute("class");
        System.out.println("value = " + value);
    }
}
