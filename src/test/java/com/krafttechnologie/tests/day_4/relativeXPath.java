package com.krafttechnologie.tests.day_4;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class relativeXPath {
    public static void main(String[] args) {

    WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");

   String text= driver.findElement(By.xpath("(//a[@href='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();
   // String text= driver.findElement(By.xpath(("(//a[@*='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();
        System.out.println("text"+ text);
    }

    }



