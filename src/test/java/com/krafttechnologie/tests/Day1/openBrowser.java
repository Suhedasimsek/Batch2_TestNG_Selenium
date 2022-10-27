package com.krafttechnologie.tests.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();// webdriver kütüphanesinden chromu hazır hale getirdik
        WebDriver driver=new ChromeDriver(); //Webdriver classından driverı hazır hale getirdik. Polymorphism
        driver.get("https://www.krafttechnologie.com/");
        driver.manage().window().maximize();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String expectedTitle="Kraft Technologie | Yazılım ve Bilişim Eğitimleri – Uzaktan Canlı Eğitim";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Başlık beklendiği gibi.Doğrulama başarılı");
        }else {
            System.out.println("Başlık beklendiği gibi değil");
        }


    }
}
