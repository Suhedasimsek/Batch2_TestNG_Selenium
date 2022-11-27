package com.krafttechnologie.tests.day_15;

import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMNegativeTest extends TestBase {
    LoginPages loginPages = new LoginPages();
    @Test
    public void wrongPassword2() {

        driver.get(ConfigurationReader.get("url"));

        loginPages.userEmailInput_loc.sendKeys(ConfigurationReader.get("username"));
        loginPages.passwordInput_loc.sendKeys("wrongpassword");
        loginPages.submitButton_loc.click();

    }
    @Test
    public void wrongUsername() {

        driver.get(ConfigurationReader.get("url"));
        loginPages.userEmailInput_loc.sendKeys("wrongusername");
        loginPages.passwordInput_loc.sendKeys(ConfigurationReader.get("password"));//Keys.ENTER
        loginPages.submitButton_loc.click();
        String actual=loginPages.warningMessage_loc.getText();
        String expected="Email address or password is incorrect. Please check";
        Assert.assertEquals(actual,expected);

    }
}
