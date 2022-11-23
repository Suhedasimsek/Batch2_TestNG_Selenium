package com.krafttechnologie.tests.day_14;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPages loginPages=new LoginPages();

    @Test
    public void openBrowserUsingConfigurationReader(){

        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.name("email")).sendKeys(ConfigurationReader.get("username"));
        driver.findElement(By.name("password")).sendKeys(ConfigurationReader.get("password")+ Keys.ENTER);
    }
@Test
    public void LoginWithMethod(){
    loginPages.loginUser();
    DashboardPage dashboardPage=new DashboardPage();

    String actualTitle=dashboardPage.DashboardPageTitle("Dashboard");

    String expectedTitle="Dashboard";

    System.out.println("actualTitle = " + actualTitle);

    Assert.assertEquals(actualTitle,expectedTitle);
}
}

