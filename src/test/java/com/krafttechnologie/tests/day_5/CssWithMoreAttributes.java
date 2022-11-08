package com.krafttechnologie.tests.day_5;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssWithMoreAttributes {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement componentText= driver.findElement(By.cssSelector("div[class='row']>div[class='col-md-4']"));
        System.out.println("componentText.getText() = " + componentText.getText());

    }
}
