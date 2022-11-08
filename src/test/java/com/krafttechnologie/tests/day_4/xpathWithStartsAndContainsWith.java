package com.krafttechnologie.tests.day_4;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathWithStartsAndContainsWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
        WebElement searchBox =driver.findElement(By.xpath("//input[starts-with(@class,'desktopOld')]"));
        searchBox.sendKeys("Selenium");
        WebElement searchbtn=driver.findElement(By.xpath("//div[contains(@class,'SearchBoxOld-cH')]"));
        searchbtn.click();

    }
}
