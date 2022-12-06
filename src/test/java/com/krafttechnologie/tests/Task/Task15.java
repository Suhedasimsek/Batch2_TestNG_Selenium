package com.krafttechnologie.tests.Task;

import com.krafttechnologie.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Task15 extends TestBase {
    @Test
    public void Task15() throws InterruptedException {

        driver.get("http://demo.guru99.com/test/radio.html");


//        WebElement c1=driver.findElement(By.xpath("//input[@value='checkbox1']"));
//        c1.click();

        // checkBoxlara sırasıyla tek tek tıklamak istiyoruz. birden fazla old için list alıyoruz
        List<WebElement> listCheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < listCheckBox.size(); i++) {
            listCheckBox.get(i).click();
            Thread.sleep(3000);
        }

    }
}