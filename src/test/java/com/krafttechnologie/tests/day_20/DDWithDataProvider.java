package com.krafttechnologie.tests.day_20;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDWithDataProvider {
    @DataProvider(name="AracSatısOranları")
    public Object[][] testData() {

        String[][] data = {

                {"Audi", "100", "80", "65", "55"},
                {"Honda", "112", "127", "135", "60"},
                {"Tesla", "20", "30", "25", "15"},
                {"Mazda", "70", "50", "65", "75"},
                {"Porche", "40", "43", "22", "17"},
                {"Toyota", "100", "180", "165", "155"},
                {"Volvo", "66", "33", "22", "77"},
                {"Mercedes", "73", "80", "65", "55"},


        };
        return data;
    }

    @Test(dataProvider ="AracSatısOranları")
    public void test(String aracMarkasi, String Ocak,String Subat, String Mart,String Nisan){

        System.out.println("Arac Markasi :" +aracMarkasi+" : "+Ocak+","+Subat+" ,"+Mart+" ,"+Nisan+"");


    }
}