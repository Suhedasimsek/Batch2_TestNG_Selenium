package com.krafttechnologie.tests.day_3;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        Faker faker=new Faker();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement inputUserName=driver.findElement(By.id("userName"));
        inputUserName.sendKeys("Mike");
        Thread.sleep(2000);

        WebElement inputEmail=driver.findElement(By.id("userEmail"));
        inputEmail.sendKeys(faker.internet().emailAddress());

        Thread.sleep(2000);



    }
}
