package com.krafttechnologie.tests.Task;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task10 extends TestBase {
    //https://demoqa.com/links Links to an external site.sitesine git
    //li tag indeki tum elementlerin size ni aldir ve assert yaptir(expectedSize =32 olacak).
    @Test
    public void Task10(){
        driver.get("https://demoqa.com/links");
        WebElement click_here = driver.findElement(By.linkText("Home"));
        click_here.click();
        BrowserUtils.waitFor(2);
        String currentTab = driver.getWindowHandle();
        driver.switchTo().window(currentTab);
        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='category-cards']"));
        System.out.println(elements.size());

    }


}
