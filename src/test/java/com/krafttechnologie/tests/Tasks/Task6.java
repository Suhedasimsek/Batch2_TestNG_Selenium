package com.krafttechnologie.tests.Tasks;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task6 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }



    @Test
    public void nestedIframe(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // switch to middle frame and get MIDDLE text

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        System.out.println("driver.findElement(By.cssSelector(\"#content\")).getText() = " + driver.findElement(By.cssSelector("#content")).getText());


        // got to Right frame and get text

        // driver.switchTo().parentFrame(); // selenium switch to parent

        driver.switchTo().defaultContent(); // selenium switch the top
        driver.switchTo().frame("frame-top"); // if we use defaultContent(), we should start first step

        driver.switchTo().frame(2);
        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = " + driver.findElement(By.tagName("Body")).getText());

        // go to bottom frame and get text
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = " + driver.findElement(By.tagName("Body")).getText());
    }
}

