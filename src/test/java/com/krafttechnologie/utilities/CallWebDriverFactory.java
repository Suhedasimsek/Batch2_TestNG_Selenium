package com.krafttechnologie.utilities;

import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");

        Thread.sleep(3000);

        //driver.close();

        //task
        //Task
        // go to http://www.krafttechexlab.com/  website
        //expected title = Dashboard- Kraft Techex Lab - aFm
        //get title and verify that expected title equal actual title
        String expectedTitle = "Dashboard- Kraft Techex Lab - aFm";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Başlık beklendiği gibi.Doğrulama başarılı");
        } else {
            System.out.println("Başlık beklendiği gibi değil");
        }
    }
}
