package com.krafttechnologie.tests.Tasks;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task2 {
    public static void main(String[] args) {
//        https://www.hepsiburada.com/Links to an external site. sayfasina git
//        Search box a Test Automation kelimesini yazdir
//        Arama butonuna click yaptir
//“Test Automation ile ilgili 4 ürün bulduk” yazisini yazdir.

        String product="Test Automation";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("[class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']")).sendKeys(product);
        driver.findElement(By.cssSelector("[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']")).click();
        WebElement yazdır= driver.findElement(By.cssSelector("[class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']"));
        System.out.println("yazdır.getText() = " + yazdır.getText());


    }
}
