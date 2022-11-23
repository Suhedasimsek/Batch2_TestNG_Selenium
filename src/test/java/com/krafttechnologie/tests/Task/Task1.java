package com.krafttechnologie.tests.Task;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
//        https://www.krafttechexlab.com/Links to an external site. sayfasina git
//        Components module git
//        Alert segmesini ac
//        Acilan sayfadaki Alerts basligini yazdir.

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Components']")).click();
        WebElement alertButton=driver.findElement(By.tagName("h1"));
        alertButton.click();
        System.out.println("alertButton.getText() = " + alertButton.getText());


    }
}
