package com.krafttechnologie.tests.day_15;

import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMNegativeTest extends TestBase {

    @Test
    public void wrongPassword2() {
        LoginPages loginPages = new LoginPages();
        driver.get(ConfigurationReader.get("url"));

        loginPages.userNameInput_loc.sendKeys(ConfigurationReader.get("username"));
        loginPages.passwordInput_loc.sendKeys("wrongpassword");
        loginPages.submitButton_loc.click();

    }
    @Test
    public void wrongUsername() {
        LoginPages loginPages = new LoginPages();
        driver.get(ConfigurationReader.get("url"));

        loginPages.userNameInput_loc.sendKeys("wrongusername");
        loginPages.passwordInput_loc.sendKeys(ConfigurationReader.get("password"));//Keys.ENTER
        loginPages.submitButton_loc.click();
        String actual=loginPages.warningMessage_loc.getText();
        String expected="Email address or password is incorrect. Please check";
        Assert.assertEquals(actual,expected);

    }
}
