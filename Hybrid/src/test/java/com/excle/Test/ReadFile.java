package com.excle.Test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Hybrid\\Test data\\Test Data.xlsx";
		String sheetName="loginCredentials";
		readData(path, sheetName);

	}

	static void readData(String path,String sheetName) throws Exception {
		File file=new File(path);
		FileInputStream fr=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fr);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
	 
		 System.out.println("Totalrow:-"+rowCount);
		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("TotalColumns:-"+noOfColumns);
		for(int i=0 ;i<rowCount;i++) {
			
			for(int j=0;j<noOfColumns;j++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
	       }

	 }
}
