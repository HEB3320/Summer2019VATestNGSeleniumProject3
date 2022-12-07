package com.cybertek.tests.d18_data_driven_testing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SelfStudy {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void main(String[] args) {
        getRowCount();
    }

    public static void getRowCount() {


        try {

            projectPath = System.getProperty("user.dir");
            System.out.println(projectPath);
            workbook = new XSSFWorkbook(projectPath + "\\src\\test\\resources\\Vytrack testusers.xlsx");
            sheet = workbook.getSheet("QA1-all");
           // Cell cell =sheet.getRow(1).getCell(2);
            System.out.println(sheet.getLastRowNum());
            System.out.println(sheet.getPhysicalNumberOfRows());
            String cellData = sheet.getRow(2).getCell(2).getStringCellValue();
            System.out.println(cellData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


}
