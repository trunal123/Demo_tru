package test;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadwriteExcel {
    public static void main(String args[]) throws IOException {
        //Create an object of File class to open xlsx file
        File file = new File("C:\\Users\\Perennial - QA\\Desktop\\Datafile.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        XSSFWorkbook Wd = new XSSFWorkbook(inputStream);
        //HSSFWorkbook wb = new HSSFWorkbook(inputStream);
        XSSFSheet sheet = Wd.getSheet("STUDENT_DATA");

        //HSSFSheet sheet=wb.getSheet("STUDENT_DATA");

        XSSFRow row2=sheet.getRow(1);

        //Create a row object to retrieve row at index 1
        //HSSFRow row2=sheet.getRow(1);

        //Create a cell object to retreive cell at index 5

        XSSFCell cell=row2.getCell(5);
        //HSSFCell cell=row2.getCell(5);

        //Get the address in a variable
        String address= cell.getStringCellValue();

        //Printing the address
        System.out.println("Address is :"+ address);

    }
}
