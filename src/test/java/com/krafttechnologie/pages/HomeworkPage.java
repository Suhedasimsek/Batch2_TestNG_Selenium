package com.krafttechnologie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeworkPage extends BasePage{
     @FindBy(id = "firstName")
    public WebElement ToolsName_loc;

     @FindBy(id = "lastName")
    public WebElement ToolsLastName_loc;

     @FindBy(css = "#userEmail")
    public WebElement ToolsEmail_loc;

     @FindBy(css = "#gender-radio-2")
    public WebElement ToolsGender_loc;

     @FindBy(css = "#userNumber")
    public WebElement ToolsNumber_loc;

     @FindBy(css = "#dateOfBirthInput")
    public WebElement ToolsDateInput_loc;

     @FindBy(id = "subjectsInput")
    public WebElement ToolsSubjectInput_loc;

     @FindBy(css = "[class='react-datepicker__month-select']")
    public WebElement ToolsMounth_loc;

     @FindBy(css = "[class='react-datepicker__year-select']")
    public WebElement ToolsYear_loc;

    @FindBy(xpath = "//div[.='6']")
    public WebElement ToolsDay_loc;

    @FindBy(css = "#hobbies-checkbox-1")
    public WebElement ToolsHobbies1_loc;

    @FindBy(css = "#hobbies-checkbox-2")
    public WebElement ToolsHobbies2_loc;

    @FindBy(css = "#hobbies-checkbox-3")
    public WebElement ToolsHobbies3_loc;

    @FindBy(css = "#uploadPicture")
    public WebElement ToolUploadPitcure_loc;

    @FindBy(css = "#currentAddress")
    public WebElement ToolsAdress_loc;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
    public WebElement ToolsState_loc;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    public WebElement ToolsCity_loc;

    @FindBy(id = "react-select-3-input")
    public WebElement StateName_loc;

    @FindBy(id = "react-select-4-input")
    public WebElement CityName_loc;

    @FindBy(css = "#submit")
    public WebElement ToolsSubmitButton_loc;




}
