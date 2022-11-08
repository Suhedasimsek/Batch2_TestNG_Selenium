package com.krafttechnologie.tests.day_5;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssWithClass {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("TextNg");

        WebElement searchButton=driver.findElement(By.cssSelector(".nav-search-submit-text.nav-sprite.nav-progressive-attribute"));
        searchBox.click();
        driver.close();
    }
}
