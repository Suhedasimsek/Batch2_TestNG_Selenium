package com.krafttechnologie.tests.day_5;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task {
    public static void main(String[] args) {
        //TASK: amazon.com a git
       // search box a Css Selector yaz
        //Search button unna click yap
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement SearchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        //2. yol  WebElement inputSearchBox=driver.findElement(By.id("twotabsearchtextbox"));
        SearchBox.sendKeys("CSS");

        WebElement searchButton= driver.findElement(By.cssSelector("#nav-search-submit-button"));
        searchButton.click();
        driver.close();

    }
}
