package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Try {
    public static void main(String[] args) {
        String email="mike@gmail.com";
        String password="12345";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();


        String expectUrl = driver.getCurrentUrl();
        String actualURL= driver.getCurrentUrl();
        if (expectUrl.equals(actualURL)){
            System.out.println("PASS");
        }else System.out.println("FAILED");


        String expectedHomePageText="Dashboard";
        String actualHomePageText=driver.findElement(By.tagName("h1")).getText();
        if(expectedHomePageText.equals(actualHomePageText)){
            System.out.println("PASS");
        }else System.out.println("FAİLED");

        driver.close();;
    }
}
