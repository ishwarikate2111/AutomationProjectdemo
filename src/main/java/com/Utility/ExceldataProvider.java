package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider {

public String getStringTestData(String sheetname,int row,int cell) throws Throwable {
	String path= System.getProperty("user.dir" )+"\\TestData\\Datalogin.xlsx";
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	DataFormatter data=new DataFormatter();

	XSSFSheet name= wb.getSheet(sheetname);
	String cellvalue= data.formatCellValue(name.getRow(0).getCell(row));
	return cellvalue;
}

}