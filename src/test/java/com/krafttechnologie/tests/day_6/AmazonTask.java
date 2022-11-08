package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTask {
    public static void main(String[] args) {
        /** Class Task
         *  go to the amazon webpage
         *  write "selenium" to search box
         *  verify that the result of the search
         */

        String product="Selenium";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.id("nav-search-submit-button")).click();

        String actualText=driver.findElement(By.xpath("//span[contains(text(),'results for')]/..")).getText();

        if (actualText.contains(product)){
            System.out.println("Pass");
        }else System.out.println("Failed");
        driver.close();
    }
}
