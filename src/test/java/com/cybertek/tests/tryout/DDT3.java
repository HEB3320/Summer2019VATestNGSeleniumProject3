package com.cybertek.tests.tryout;

import com.cybertek.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DDT3 {

    @DataProvider
    public Object[][] getDataArray() throws IOException {

        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "\\src\\test\\resources\\EnginSelf.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();//3
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();//3



        String[][] data = new String[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {


            for (int j = 0; j < columnCount; j++) {
            //   Cell cell = sheet.getRow(i).getCell(j);
                //String cellData = cell.toString();
                data[i][j] = sheet.getRow(i).getCell(j).toString();


            }
        }
        return data;
    }

    @Test(dataProvider = "getDataArray")
    public void test1(String username, String password, String domain) throws InterruptedException, IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://login.cbh2.crediblebh.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("UserName")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("DomainName")).sendKeys(domain);
        Thread.sleep(2000);
        driver.quit();

    }





}