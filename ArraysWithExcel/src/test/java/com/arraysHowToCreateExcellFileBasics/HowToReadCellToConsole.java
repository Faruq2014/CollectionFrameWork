package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;
import java.util.Date;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToReadCellToConsole {

	public static void main(String[] args) {
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet(); // working on default sheet0.
		
		XSSFRow row0=sheet.createRow(0);    // create row
		XSSFCell cell=row0.createCell(0); 	// create cell
		cell.setCellValue("User Nmae");      // set cell value
		XSSFCell cell1=row0.createCell(1); 	// create cell
		cell1.setCellValue("Password");
		
	   //How to read in console
		 System.out.println("How to read in console: ");
	 System.out.println(cell.getRichStringCellValue().toString());
	 
	String data= cell1.getRichStringCellValue().toString();
	 System.out.println(data);
	 
	 XSSFRow row1=sheet.createRow(1);
	 row1.createCell(0).setCellValue("Faruq"); 
	 row1.createCell(1).setCellValue("F123");
	System.out.println( row1.getCell(0).getRichStringCellValue().toString());
	System.out.println( row1.getCell(1).getRichStringCellValue().toString());
	 
	 XSSFRow row2=sheet.createRow(2);
	 row2.createCell(0).setCellValue("Arif"); 
	 row2.createCell(1).setCellValue("A321");
	System.out.println( row2.getCell(0).getRichStringCellValue().toString());
	System.out.println( row2.getCell(1).getRichStringCellValue().toString());
	 
		
	 XSSFRow row6=sheet.createRow(6);
	 row6.createCell(0).setCellValue(123); 
	 row6.createCell(1).setCellValue(321);
	System.out.println( row6.getCell(0).getNumericCellValue());
	System.out.println( row6.getCell(1).getNumericCellValue());
	 
	 
	 
		
		 try {
				FileOutputStream output = new FileOutputStream("Read_in_Console.xlsx");
			workbook.write(output);
			output.close();
			workbook.close();
			System.out.println("Alhamdulillah created ");
		      } catch (Exception e) {
				e.printStackTrace();
			}  

	}

}
