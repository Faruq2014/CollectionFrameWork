package com.arraysHowToCreateExcellFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataFormat {



	@Test
	public void dataFormat() {
		try {
			//XSSFWorkbook workbook= new XSSFWorkbook();  // creating new workbook
			XSSFWorkbook workbook= new XSSFWorkbook();// working with existing one.
			XSSFSheet sheet=workbook.createSheet("DataFormat");
			XSSFRow row=sheet.createRow(0);    // create row
			XSSFCell cell=row.createCell(0); 	// create cell
			cell.setCellValue("1. cell");      // set cell value
			
			XSSFCell cell1=row.createCell(1);
			
			
			XSSFDataFormat format=workbook.createDataFormat(); // creating data format
			CellStyle DateStyle=workbook.createCellStyle();
			DateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
			cell1.setCellStyle(DateStyle);
			cell1.setCellValue(new Date()); // setting data from local machine
			
			row.createCell(2).setCellValue("3. Cell value ");
			sheet.autoSizeColumn(1);  // auto formating cell value
			
			// you must write everything created 
			//FileOutputStream out=new FileOutputStream("Format.xlsx");
			//workbook.write(out);
			workbook.write(new FileOutputStream("Format.xlsx"));
			workbook.close();
			System.out.println("Alhamdulillah");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public static void readData() throws FileNotFoundException, IOException  {
		
			XSSFWorkbook workbook=new XSSFWorkbook (new FileInputStream("Format.xlsx"));
			XSSFSheet sheet=workbook.getSheetAt(0);
			XSSFRow row=sheet.getRow(0);
			XSSFCell cell=	row.getCell(0);
			
				System.out.println(cell.getStringCellValue());
				System.out.println(cell);
		
				System.out.println(row.getCell(1));
				System.out.println(row.getCell(2));
	}
}
