package com.krafttechnologie.tests.Task;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task8 extends TestBase {
    WebDriver driver;
    @Test
    public void Task8() throws InterruptedException {
        /*Go to https://demoqa.com/automation-practice-formLinks to an external site.
Formu doldur
Submit yap
Acilan Thanks for submitting the form tablozundaki bilgileri yazdir.
Thanks for submitting the form tablosundaki
Gender
Hobbies
State and City
Student Name elementlerinin assertion larine yap*/

        driver.get("https://demoqa.com/automation-practice-formLinks");
        driver.findElement(By.id("firstName")).sendKeys("Suheda");
        driver.findElement(By.id("lastName")).sendKeys("Simsek");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("burcusuheda@hotmail.com");

            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement genderRadioButton = driver.findElement(By.cssSelector("#gender-radio-2"));
            js.executeScript("arguments[0].click();", genderRadioButton);

            driver.findElement(By.id("userNumber")).sendKeys("1231234567");

            driver.findElement(By.id("dateOfBirthInput")).click();

            WebElement selectMonths = driver.findElement(By.className("react-datepicker__month-select"));
            Select select1 = new Select(selectMonths);
            select1.selectByIndex(4);

            WebElement selectYears = driver.findElement(By.className("react-datepicker__year-select"));
            Select select2 = new Select(selectYears);
            select2.selectByVisibleText("1977");

            driver.findElement(By.xpath("(//div[.='6'])[1]")).click();

            driver.findElement(By.id("subjectsInput")).sendKeys("s");
            WebElement englishBtn = driver.findElement(By.xpath("//div[.='English']"));
            js.executeScript("arguments[0].click();", englishBtn);
            driver.findElement(By.id("subjectsInput")).sendKeys("s");
            WebElement mathsBtn = driver.findElement(By.xpath("//div[.='Maths']"));
            js.executeScript("arguments[0].click();", mathsBtn);

//        Dimension dimension = new Dimension(400, 800);
//        driver.manage().window().setSize(dimension);

            driver.manage().window().setPosition(new Point(200,200));

            driver.manage().window().setSize(new Dimension(400,800));

            js.executeScript("window.scrollBy(0,2000)");

            WebElement sportsCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
            js.executeScript("arguments[0].click();", sportsCheckBox);

            WebElement readingCheckBox = driver.findElement(By.id("hobbies-checkbox-2"));
            js.executeScript("arguments[0].click();", readingCheckBox);

            WebElement musicCheckBox = driver.findElement(By.id("hobbies-checkbox-3"));
            js.executeScript("arguments[0].click();", musicCheckBox);

            WebElement pictureUpload = driver.findElement(By.cssSelector("#uploadPicture"));
            pictureUpload.sendKeys("C:\\Users\\HP\\Desktop\\çeşitli\\laptop kimliği.png");

            driver.findElement(By.id("currentAddress")).sendKeys("PK:34650-Beylikdüzü-İstanbul");

            driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
            Thread.sleep(5000);
            WebElement state = driver.findElement(By.id("react-select-3-option-1"));
            js.executeScript("arguments[0].click();", state);


            driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]")).click();
            WebElement city = driver.findElement(By.id("react-select-4-option-1"));
            js.executeScript("arguments[0].click();", city);

            Thread.sleep(2000);

            WebElement submitButton = driver.findElement(By.id("submit"));
            js.executeScript("arguments[0].click();", submitButton);

            System.out.println(driver.findElement(By.tagName("table")).getText());

            List<WebElement> genderLine = driver.findElements(By.xpath("(//table//tr)[4]//td"));
            String actualGender = genderLine.get(1).getText();
            Assert.assertEquals(actualGender, "Male", "Student gender should be male.");

            List<WebElement> hobbyLine = driver.findElements(By.xpath("(//table//tr)[8]//td"));
            String actualHobbyText = hobbyLine.get(1).getText();
            Assert.assertEquals(actualHobbyText, "Sports, Reading, Music", "All checkbox must be signed.");

            List<WebElement> stateAndCity = driver.findElements(By.xpath("(//table//tr)[11]//td"));

//        for (WebElement e : stateAndCity) {
//            System.out.println("e.getText() = " + e.getText());
//        }
            Assert.assertEquals(stateAndCity.get(1).getText(), "Uttar Pradesh Lucknow", "State and city must be equal.");

            List<WebElement> studentName = driver.findElements(By.xpath("(//table//tr)[2]//td"));
            String expectedName = "Suheda Simsek";
            String actualName = studentName.get(1).getText();

            Assert.assertEquals(actualName, expectedName, "vf");


            Thread.sleep(5000);

        }
    }
