package com.krafttechnologie.tests.day_20;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExelUtilPractice extends TestBase {
    @Test
    public void ReadExelFile() {
        ExcelUtil qaTeam3=new ExcelUtil("src/test/resources/LoginList.xlsx", "QaTeam3");
        System.out.println("qaTeam3.rowCount() = " + qaTeam3.rowCount());//satır
        System.out.println("qaTeam3.columnCount() = " + qaTeam3.columnCount());//sütun
        System.out.println("qaTeam3.getColumnsNames() = " + qaTeam3.getColumnsNames());
       List<Map<String, String>> dataList=qaTeam3.getDataList();
        System.out.println("dataList = " + dataList);
        for (Map<String, String> row:qaTeam3.getDataList()){
            System.out.println("row = " + row);
            System.out.println("dataList.get(2) = " + dataList.get(2));
            System.out.println("dataList.get(2).get(\"Your name\") = " + dataList.get(2).get("Your name"));
        String [][] dataArray= qaTeam3.getDataArray();
            System.out.println("Arrays.deepToString(dataArray) = " + Arrays.deepToString(dataArray));


        }

    }
}
