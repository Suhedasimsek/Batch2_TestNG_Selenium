package com.krafttechnologie.tests.Task;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task14 extends TestBase {
    @Test
    public void task14() {
        //https://demoqa.com/links Links to an external site.sitesine git
        //li tag indeki tum elementlerin size ni aldir ve assert yaptir(expectedSize =32 olacak).

            driver.get("https://demoqa.com/links");
            List<WebElement> elements = driver.findElements(By.xpath("//li[@class='btn btn-light ']"));
            elements.get(1).click();
        System.out.println(elements.get(3).getText());
        System.out.println(elements.size());
        BrowserUtils.waitFor(2);

            String actualSize = String.valueOf(elements.size());
            String expectedSize = "32";
            System.out.println(actualSize);
            System.out.println(expectedSize);


            Assert.assertEquals(actualSize, expectedSize, "FAIL");
        }
    }

