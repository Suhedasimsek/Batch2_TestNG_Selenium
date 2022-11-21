package com.krafttechnologie.tests.day_14;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task extends TestBase {

    @Test
    public void login(){

        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.name("email")).sendKeys(ConfigurationReader.get("username"));
        driver.findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password"));
       WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']"));
       login.click();
    }

}
