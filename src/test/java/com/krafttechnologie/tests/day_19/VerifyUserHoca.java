package com.krafttechnologie.tests.day_19;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.pages.ProfilePage;
import com.krafttechnologie.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserHoca extends TestBase {

        @Test
        public void userInfo() {
            LoginPages loginPages=new LoginPages();
            DashboardPage dashboardPage=new DashboardPage();
            ProfilePage profilePage=new ProfilePage();

            extentLogger=report.createTest("User Info Verification ");

            extentLogger.info("Login as a user");
            loginPages.loginUser();

            String expectedAccountName="Rabinson";
            extentLogger.info("Verify that login is successful and account name is " +
                    expectedAccountName);
            String actualAccountName=loginPages.getAccountName_mtd(expectedAccountName);
            System.out.println("actualAccountName = " + actualAccountName);
            Assert.assertEquals(actualAccountName,expectedAccountName);

            extentLogger.info("Click on My profile");
            //loginPages.navigateToModule("My Profile","");
            dashboardPage.myProfile.click();

            String profileTab="Edit Profile";
            extentLogger.info("Click on Edit Profile");
            profilePage.profileTabs(profileTab);

            String expectedEmail="mike@gmail.com";
            extentLogger.info("Verify that email values is " + expectedEmail);
            Assert.assertEquals(profilePage.profilEmail_loc
                    .getAttribute("value"),expectedEmail);

            extentLogger.info("Navigate back");
            driver.navigate().back();

            extentLogger.info("Verify that Dashboard page with url");
            Assert.assertEquals(driver.getCurrentUrl()
                    ,"https://www.krafttechexlab.com/index");

        }
    }
