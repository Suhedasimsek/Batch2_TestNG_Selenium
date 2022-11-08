package com.krafttechnologie.tests.day_6;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementTask {

    /* Class Task
     * open the chrome browser
     * go to https://www.krafttechexlab.com/login
     * click on login button
     * verify that url did not changed
     */

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        String expectUrl = driver.getCurrentUrl();
       // easyWay driver.findElement(By.xpath("//button[text()='Login']")).click();
       WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
        String actualURL= driver.getCurrentUrl();
        if (expectUrl.equals(actualURL)){
            System.out.println("PASS");
        }else System.out.println("FAILED");

        driver.close();;

    }
}
