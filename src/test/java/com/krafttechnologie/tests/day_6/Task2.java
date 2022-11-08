package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         *         open chrome browser
         *          go to https://www.krafttechexlab.com/login
         *         enter email as mike@gmail.com
         *         enter password as 12345
         *         click login btn
         *         verify that Url has changed
         */
        String email="mike@gmail.com";
        String password="12345";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        String expectUrl=driver.getCurrentUrl();
        System.out.println("expectUrl = " + expectUrl);
        Thread.sleep(2000);

        WebElement emailInputBox=driver.findElement(By.id("email"));
        emailInputBox.sendKeys(email);

        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys(password);

        WebElement LoginButton=driver.findElement(By.cssSelector("[type='submit']"));
        LoginButton.click();


        String actualUrl=driver.getCurrentUrl();
        System.out.println("expectUrl = " + expectUrl);
        Thread.sleep(2000);

        if (expectUrl.equals(actualUrl)){
            System.out.println("not changed");
        }else System.out.println("changed");

        driver.close();;


    }
}
