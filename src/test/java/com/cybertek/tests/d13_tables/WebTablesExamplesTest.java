package com.cybertek.tests.d13_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable() {
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());

        // verify jsmith@gmail.com is present in table
        Assert.assertTrue(myTable.getText().contains("jsmith@gmail.com"));
    }

    @Test
    public void getAllHeaders() {
        // get all column names individually
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());


        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

        // get all column names in a single webelement
        WebElement headers2 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(headers2.getText());
    }

    @Test
    public void printTableSize() {
        // NUMBER OF COLUMNS
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("number of columns: = " + headers.size());
        // NUMBER OF ROWS WITH HEADERS
        List<WebElement> allRowsIncludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows including headers: " + allRowsIncludingHeaders.size());

        // NUMBER OF ROWS WITHOUT HEADERS
        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows excluding headers: " + allRowsExcludingHeaders.size());
        // '''

    }


    @Test
    public void getRow() {
        // get any from the table using index. we will ignore the headers. 1st row is the 1st row in the body
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
    //    System.out.println(row.getText());

        // get all the table row dynamically. we can do it in 2 steps
        // 1. get the number rows
        // based on the number of rows iterate each row

        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows excluding headers: " + allRowsExcludingHeaders.size());

        for (int i = 1; i <= allRowsExcludingHeaders.size(); i++) {
            String xpath2 = "//table[@id='table1']/tbody/tr[" + i + "]";
            System.out.println(xpath2);
            WebElement singleRow = driver.findElement(By.xpath(xpath2));
            System.out.println(singleRow.getText());
        }

    }

    @Test
    public void getAllCellsInRow() {
        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
        for (WebElement cell : allCellsInOneRow) {
            System.out.println(cell.getText());
        }
        System.out.println("number of cells in this row: " + allCellsInOneRow.size());
    }


    @Test
    public void getSingeCellByIndex() {
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[4]"));
        System.out.println(singleCell.getText());
    }

    @Test
    public void printAllCellByIndex() {
        // get number of rows
        int rowNumber = getNumberOfRows();
        // get number of columns
        int colNumber = getNumberOfCols();

        // iterates each row in the table
        for (int i = 1; i <= rowNumber; i++) {
            // iterate each cell in the row
            for (int j = 1; j <= colNumber; j++) {
                // i --> index of tr (row)
                // j --> index of rd (cell)
                String xpath = "//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]";
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText());
            }
        }
    }

    private int getNumberOfCols() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    /**
     * returns number of row in the body of the table. skips the table header
     *
     * @return
     */
    private int getNumberOfRows() {
        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRowsExcludingHeaders.size();
    }


    @Test
    public void getSpecificCellByIndex() {
        // get cell by given indexes
        int r = 2; // row number
        int c = 4; // column number

        String xpath = "//table[@id='table1']/tbody/tr[" + r + "]/td[" + c + "]";
        WebElement cell = driver.findElement(By.xpath(xpath));
        System.out.println(cell.getText());
        // get the background color
        System.out.println(cell.getCssValue("background-color"));
    }

    @Test
    public void getCellInRelationToAnotherCellInSameRow() {
        // get email of Jason
        // email is in the 3rd column
        String name = "Jason";
        String xpath = "//table[@id=‘table1']//td[.='" + name + "']/../td[3]";
        System.out.println(driver.findElement(By.xpath(xpath)).getText());
    }
@Test
    public void self(){

    List<WebElement> allCells = driver.findElements(By.xpath("//table[@id='table1']//th|//td"));
    System.out.println(allCells.size());
allCells.forEach(Hayri-> System.out.println(Hayri.getText()));
}

}