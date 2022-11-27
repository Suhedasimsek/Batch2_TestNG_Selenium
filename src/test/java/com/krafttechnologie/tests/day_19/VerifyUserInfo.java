package com.krafttechnologie.tests.day_19;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.pages.ProfilePage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserInfo extends TestBase {

   @Test
    public void Task1() {
        /*
         * go to https://www.krafttechexlab.com/login web site
         * Login as a user
         * Verify that login is successful with account name
         * Click on My profile
         * Click on My profile
         * Verify that email value
         * navigate back
         * Verify that Dashboard page with url
         */

       LoginPages loginPages=new LoginPages();
       DashboardPage dashboardPage=new DashboardPage();
       ProfilePage profilePage=new ProfilePage();
        extentLogger=report.createTest("Task1 Report");

       extentLogger.info("Login as a user");

        loginPages.loginUser();
       extentLogger.info("Verify that login is successful with account name");
        String actualAccountName=driver.findElement(By.xpath("//span[@class='d-none d-md-block dropdown-toggle ps-2']")).getText();
        String expectedAccountName="Rabinson";

        Assert.assertEquals(actualAccountName,expectedAccountName);
       extentLogger.info("Click on My profile");
        dashboardPage.myProfile.click();
       extentLogger.info("Click on Edit Profile");
        profilePage.profileTabs("Edit Profile");
        extentLogger.info("Verify that email value");
       String actualEmail=driver.findElement(By.id("email")).getAttribute("value");
       String expectedEmail="mike@gmail.com";
        Assert.assertEquals(actualEmail,expectedEmail);
       extentLogger.info("navigate back");
        driver.navigate().back();
       extentLogger.info("Verify that Dashboard page with url");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/index";
        Assert.assertEquals(actualUrl, expectedUrl);


    }
}
