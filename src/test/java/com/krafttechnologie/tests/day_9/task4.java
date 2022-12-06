package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class task4 extends TestBase {
    @Test
            public void Task4(){
        //Multiselect drop down a blue gönder select classla olmuyor
        driver.get("https://demoqa.com/select-menu");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");

        WebElement selectElement= driver.findElement(By.id("react-select-4-input"));
        jse.executeScript("arguments[0].click();",selectElement);
        selectElement.sendKeys("Blue");

        WebElement slctElmnt=driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[3]"));
        WebElement blue=driver.findElement(By.cssSelector("[class='css-12jo7m5']"));
        System.out.println(blue.getText());
    }
}
