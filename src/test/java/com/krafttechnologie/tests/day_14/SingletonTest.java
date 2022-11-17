package com.krafttechnologie.tests.day_14;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void test1(){
        // Singleton singleton=new Singleton();

        String driver1=Singleton.getInstance();
        String driver2=Singleton.getInstance();

        System.out.println(driver1);
        System.out.println(driver2);

    }
    @Test
    public void Test2(){
        //WebDriver driver= WebDriverFactory.getDriver("chrome"); yerine
        WebDriver driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));


    }

    @Test
    public void test3() {
       // WebDriver driver= WebDriverFactory.getDriver("chrome");
        WebDriver driver=Driver.get();//bununla tek sayfada açıyor
        driver.get(ConfigurationReader.get("https://www.amazon.com.tr"));
    }

    @Test
    public void test4() {
        //WebDriver driver= WebDriverFactory.getDriver("chrome");bunlarla iki ayrı pencerede açıyor
        WebDriver driver=Driver.get();
        driver.get(ConfigurationReader.get("https://www.amazon.com.tr"));
    }
}
