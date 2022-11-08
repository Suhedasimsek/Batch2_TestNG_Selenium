package com.krafttechnologie.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.krafttechnologie.com/");
        Thread.sleep(3000);
        driver.close();// close current tab
    //   driver.get("https://www.facebook.com/");// sayfayı closela kapattığım için yine nesne oluşturmaliyim
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
}
