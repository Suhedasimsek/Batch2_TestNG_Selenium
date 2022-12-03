package com.krafttechnologie.tests.Task;

import com.krafttechnologie.pages.HomeworkPage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task11 extends TestBase {
HomeworkPage homeworkPage=new HomeworkPage();
    @Test
    public void Task11()  {
        /*Go to https://demoqa.com/automation-practice-formLinks to an external site.
Formu doldur
Submit yap
Acilan Thanks for submitting the form tablozundaki bilgileri yazdir.
Thanks for submitting the form tablosundaki
Gender
Hobbies
State and City
Student Name elementlerinin assertion larine yap*/
        driver.get(ConfigurationReader.get("url2"));
        homeworkPage.ToolsName_loc.sendKeys("Suheda");
        homeworkPage.ToolsLastName_loc.sendKeys("Simsek");
        homeworkPage.ToolsEmail_loc.sendKeys("burcusuheda@hotmail.com");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        WebElement gender=homeworkPage.ToolsGender_loc;
        jse.executeScript("arguments[0].click();", gender);
        homeworkPage.ToolsNumber_loc.sendKeys("1111111111");
        jse.executeScript("window.scrollBy(0,4000)");
        homeworkPage.ToolsDateInput_loc.click();
        Select selectMounth=new Select(homeworkPage.ToolsMounth_loc);
        selectMounth.selectByVisibleText("July");
        Select selectYear=new Select(homeworkPage.ToolsYear_loc);
        selectYear.selectByVisibleText("1984");
        jse.executeScript("window.scrollBy(0,4000)");
        homeworkPage.ToolsDay_loc.click();
        homeworkPage.ToolsSubjectInput_loc.sendKeys("some words");

        WebElement hobbies1=homeworkPage.ToolsHobbies1_loc;
        jse.executeScript("arguments[0].click();", hobbies1);

        WebElement hobbies2=homeworkPage.ToolsHobbies2_loc;
        jse.executeScript("arguments[0].click();", hobbies2);

        WebElement hobbies3=homeworkPage.ToolsHobbies3_loc;
        jse.executeScript("arguments[0].click();", hobbies3);

       WebElement pitcureUpload=homeworkPage.ToolUploadPitcure_loc;
       pitcureUpload.sendKeys("C:\\Users\\FMÇ\\Desktop\\images.jpeg");


        //Dimension dimension = new Dimension(400, 800);
        //driver.manage().window().setSize(dimension);

       driver.manage().window().setPosition(new Point(200,200));
       driver.manage().window().setSize(new Dimension(400,800));

        homeworkPage.ToolsAdress_loc.sendKeys("Yenimahalle/Ankara");
        BrowserUtils.waitFor(2);
        jse.executeScript("window.scrollBy(0,6000)");
        BrowserUtils.waitFor(2);
        homeworkPage.ToolsState_loc.click();
        //Select selectState=new Select(homeworkPage.ToolsState_loc);
        //selectState.selectByIndex(1);

        // Select selectCity=new Select(homeworkPage.ToolsCity_loc);
        //selectCity.selectByVisibleText("Delhi");
        //WebElement state= driver.findElement(By.id("react-select-3-input"));
        WebElement state= homeworkPage.StateName_loc;
        jse.executeScript("arguments[0].click();", state);
        //WebElement city= driver.findElement(By.id("react-select-4-input"));
        WebElement city= homeworkPage.CityName_loc;
        jse.executeScript("arguments[0].click();", city);
        WebElement submitButton = homeworkPage.ToolsSubmitButton_loc;
        jse.executeScript("arguments[0].click();", submitButton);
        BrowserUtils.waitFor(2);

        //Table
        System.out.println(driver.findElement(By.tagName("table")).getText());
        List<WebElement> genderLine = driver.findElements(By.xpath("(//table//tr)[4]//td"));
        String actualGender = genderLine.get(1).getText();
        Assert.assertEquals(actualGender, "Female", "Student gender should be female.");
        List<WebElement> studentNameLine = driver.findElements(By.xpath("(//table//tr)[2]//td"));
        String actualStudentName = studentNameLine.get(1).getText();
        Assert.assertEquals(actualStudentName, "Suheda Simsek", "Student name must be Suheda Simsek.");
        List<WebElement> hobbies=driver.findElements(By.xpath("(//table//tr)[8]//td"));
        String actualHobbies = hobbies.get(1).getText();
        Assert.assertEquals(actualHobbies, "Sports, Reading, Music", "Hobbies should be Sports, Reading, Music.");


    }
}
