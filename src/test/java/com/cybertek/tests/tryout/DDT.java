package com.cybertek.tests.tryout;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DDT {


    @Test
    public static void getRowCount() throws IOException {
        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "/src/test/resources/EnginSelf.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);
    }

    @Test
    public static void getCellData() throws IOException {

        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "/src/test/resources/EnginSelf.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(cellData);

        //double cellData1 = sheet.getRow(1).getCell(1).getNumericCellValue();
       // System.out.println(cellData1);
    }

    @Test
    public static void getCellCount() throws IOException {

        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "/src/test/resources/EnginSelf.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of Column: " + cellCount);

    }


    @Test
    public  static void TestData() throws IOException {
        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "/src/test/resources/EnginSelf.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();



      //  Object [][] data =new Object[rowCount-1][cellCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < cellCount; j++) {
                System.out.println(sheet.getRow(i).getCell(j));

            }
        }


    }










}










