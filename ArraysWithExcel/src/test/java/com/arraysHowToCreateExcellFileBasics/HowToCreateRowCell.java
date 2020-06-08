package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreateRowCell {

	public static void main(String[] args) {
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet(); // working on default sheet0.
		XSSFRow row=sheet.createRow(0);    // create row
		XSSFCell cell=row.createCell(0); 	// create cell
		cell.setCellValue("1. cell");      // set cell value
		
		Cell cell1=sheet.createRow(0).createCell(1);
		cell1.setCellValue("MashAllah");
		// in Excel row has number 1,2,3..so on. but java follow indexing. as a result
		// excel row 1= java row 0,  excel row 2= java row 1, 
		
		// in Excel column has number A,B,C..so on. but java follow indexing. as a result
				// excel column A= java Cell 0,  excel column 2= java Cell 1, and so on...
				
		// quicker way to create cell.
		XSSFSheet sheet1=workbook.createSheet("pancake");
	  sheet1.createRow(0).createCell(0).setCellValue("User");
	  
	  XSSFSheet sheet3=workbook.createSheet("Mango");
	  sheet3.createRow(0).createCell(0).setCellValue("Faruq");
		
		
		 try {
				FileOutputStream output = new FileOutputStream("MultipoleSheet.xlsx");
			workbook.write(output);
			output.close();
			System.out.println("Alhamdulillah created ");
		      } catch (Exception e) {
				e.printStackTrace();
			}  

	}

}
