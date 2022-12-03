package com.krafttechnologie.tests.day_20;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFrameworkLoginTest extends TestBase {
    @DataProvider
    public Object [][] userData(){
        ExcelUtil qaTeam3= new ExcelUtil("src/test/resources/LoginList.xlsx","QaTeam3");
        String [][] dataArray= qaTeam3.getDataArrayWithoutFirstRow();

        return dataArray;

    }
    @Test(dataProvider= "userData")
    public void LoginTestWithDDF(String email, String password, String yourName){

            LoginPages loginPages=new LoginPages();
            DashboardPage dashboardPage=new DashboardPage();
            loginPages.loginWithParameters(email,password);
           String actualName=dashboardPage.getUserName();
           String expectedName=yourName;
        Assert.assertEquals(actualName,expectedName);


    }
}
