package com.krafttechnologie.tests.day_9;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownWithNoSelect {
    //Select tagı yoksa açılan sekmelere incele yapılamıyorsa incele yap etkinlik
    //dinleyicisinden blur seç yanında remove yazan yerleri sil
   WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown() {
            driver.close();
        }

        @Test
        public void test() throws InterruptedException {
            driver.get("https://demoqa.com/select-menu");
        WebElement dropdownMenu = driver.findElement(By.xpath("( //div[@class=' css-1wa3eu0-placeholder'])[1]"));
        System.out.println("dropdownMenu.getText() = " + dropdownMenu.getText());

        //Kutudaki ilk elementi assert edelim
        String expectedOption = "Select Option";
        String actualOption = dropdownMenu.getText();

        Assert.assertEquals(actualOption, expectedOption, "FAIL");
            //Dropdown icerisinde Group 2 option 1 secenegini cagiralim
            //Buradaki sorunn inspect yapilmak istenildiginde menu gizleniyor. Bu sorunu
            //asmak icin  Event Listeners dan blur altindaki ogeler remove edilir.

            dropdownMenu.click();
            WebElement group2option1= driver.findElement(By.cssSelector("#react-select-2-option-1-0"));
            group2option1.click();
            //Group 2 Option1 secildikten sonra veify etmek icin tekrar locate diyoruz.
            WebElement selectedOption=driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
            System.out.println("selectedOption.getText() = " + selectedOption.getText());
            String expectedOption2="Group 2, option 1";
            String actualOption2=selectedOption.getText();
            Assert.assertEquals(actualOption, expectedOption, "FAIL");


        }
}