package com.krafttechnologie.tests.day_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);//sleep üstüne gel add yap exeption throw atsın

        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().back();
        driver.manage().window().maximize();

        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
