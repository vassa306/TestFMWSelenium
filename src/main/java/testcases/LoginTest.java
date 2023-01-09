package testcases;

import Pages.HomePage;
import base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    @Description("Login into Eshop")
    @Severity(SeverityLevel.CRITICAL)
    public void testLoginIntoEshop(){
        HomePage home = new HomePage();
        home.clickLoginOrRegister();
    }

    





    @DataProvider
    public Object [] [] getData(){
        String sheetName = "LoginTest";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object [] [] data = new Object[rows-1][cols];
        for (int rowNum = 2;rowNum<=rows;rowNum++){
            for (int colNum = 0; colNum < cols; colNum++){
                data[rowNum -2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
            }
        }
        return data;
    }
}


