package com.krafttechnologie.tests.day_17;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.pages.ProfilePage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {
    //https://www.krafttechexlab.com/ sayfasina login olun,
    LoginPages loginPages=new LoginPages();
    DashboardPage dashboardPage=new DashboardPage();
    ProfilePage profilePage=new ProfilePage();
    WebDriver driver;
    // MyProfile gidin,
    // Edit Profile Gidin,
    // Admin ve social Network harici tum islemleri yapin sonra save yapin

    @Test
    public void Task(){
        loginPages.loginUser();

        dashboardPage.myProfile.click();
        profilePage.profileTabs("Edit Profile");
        profilePage.fullName.clear();
        profilePage.fullName.sendKeys("Robinson");
        profilePage.about.clear();
        profilePage.about.sendKeys("Some words");
        profilePage.company.clear();
        profilePage.company.sendKeys("Ghan it");
        Select select=new Select(profilePage.job);
        select.selectByVisibleText("QA");
        profilePage.website.clear();
        profilePage.website.sendKeys("https://www.krafttechexlab.com/myprofile");
        profilePage.location.clear();
        profilePage.location.sendKeys("İstanbul");
        profilePage.skills.clear();
        profilePage.company.sendKeys("TestNG,Cucumber");
        BrowserUtils.waitForPresenceOfElement(By.cssSelector("#terms"),5);
        BrowserUtils.dragAndDropBy(profilePage.slider);
        //profilePage.save.click(); hata veriyor jscript metoduyla yapalım
        BrowserUtils.clickWithJS(profilePage.save);
    }
    @Test
    public void Task2(){
        loginPages.loginUser();

        dashboardPage.myProfile.click();
        profilePage.profileTabs("Add Experience");
        profilePage.jobTitle.sendKeys("QA");
        profilePage.companyexperience.sendKeys("KraftTech");
        profilePage.locationExperience.sendKeys("Ankara");
        profilePage.startYear.sendKeys("21/11/2021");
        profilePage.endYear.sendKeys("21/11/2022");
        profilePage.jobDescription.sendKeys("Nice work");
        //profilePage.addExperienceBtn.click();
        BrowserUtils.clickWithJS(profilePage.addExperienceBtn);

    }
}
