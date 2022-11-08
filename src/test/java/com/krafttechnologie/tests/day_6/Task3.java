package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        /** Class TAsk 3
         * open chrome browser
         *          go to https://www.krafttechexlab.com/login
         *         enter email as mike@gmail.com
         *         enter password as 12345
         *         click login btn
         *         verify that home page is "Dashboard"
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


        String expectedHomePageText="Dashboard";
        String actualHomePageText=driver.findElement(By.tagName("h1")).getText();
                if(expectedHomePageText.equals(actualHomePageText)){
                    System.out.println("PASS");
                }else System.out.println("FAİLED");

        driver.close();;
    }
}
