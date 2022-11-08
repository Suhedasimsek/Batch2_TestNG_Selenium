package com.krafttechnologie.tests.day_6;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackTask {
    public static void main(String[] args) {
        /** Class Task
         *  go to the url -  "https://www.browserstack.com/users/sign_up"
         *  maximize the window
         *  accept cookies if any ,
         *  fill in the blanks with the faker class
         *  click "Term of service" checkbox
         *  and close the window
         *
         *  hint: u can use any locator you want
         *
         */

        Faker faker=new Faker();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.browserstack.com/users/sign_up/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[class='btn btn-primary cookie-notification__got-it-cta js__accept-cookie']")).click();
        driver.findElement(By.cssSelector("[placeholder='Full name']")).sendKeys(faker.internet().domainName());
        driver.findElement(By.cssSelector("[name='user[email]']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.id("user_password")).sendKeys(faker.internet().password());
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.close();



    }
}
