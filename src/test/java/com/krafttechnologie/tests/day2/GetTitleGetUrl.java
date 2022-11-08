package com.krafttechnologie.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);

    }
}
