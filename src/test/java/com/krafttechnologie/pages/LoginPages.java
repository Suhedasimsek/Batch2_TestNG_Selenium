package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends BasePage {
    public  LoginPages(){

        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(name="email")
    public WebElement userNameInput_loc;

    @FindBy(name="password")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@class='btn btn-primary w-100']")
    public WebElement submitButton_loc;

    @FindBy(xpath="//*[contains(text(),'Email address or password is incorrect. Please check')]")
    public WebElement warningMessage_loc;

    public void loginUser(){
        String username= ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");

        userNameInput_loc.sendKeys(username);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();
    }
    }
