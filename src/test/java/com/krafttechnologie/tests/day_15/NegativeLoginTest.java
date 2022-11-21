package com.krafttechnologie.tests.day_15;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void wrongPassword() {
        driver.get(ConfigurationReader.get("url"));
        WebElement userNameInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        userNameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys("some password");
        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
        WebElement warningMessage = driver.findElement
                (By.xpath("//*[contains(text(),'Email address or password is incorrect. Please check')]"));

        Assert.assertEquals(warningMessage.getText(),
                "Email address or password is incorrect. Please check",
                "Verify that user is NOT login");

    }


}

