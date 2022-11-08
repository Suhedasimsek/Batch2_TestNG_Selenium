package com.krafttechnologie.tests.day_4;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xPathwithText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://krafttechexlab.com/");
       // String text= driver.findElement(By.xpath("//li[text()='All Users Profile']")).getText();
       // String text= driver.findElement(By.xpath("//li[.='All Users Profile']")).getText();
        String text= driver.findElement(By.xpath("//*[.='All Users Profile']")).getText();
        System.out.println("text = " + text);
    }
}
