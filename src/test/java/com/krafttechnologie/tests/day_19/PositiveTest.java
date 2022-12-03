package com.krafttechnologie.tests.day_19;

import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import org.testng.annotations.Test;

public class PositiveTest extends TestBase {
    @Test
    public void Test1(){
        LoginPages loginPages=new LoginPages();
loginPages.loginUser();
    }
}
