package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreate_Cell_For_Date {

	public static void main(String[] args) {
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet(); // working on default sheet0.
		
	CellStyle	style=workbook.createCellStyle();
	CreationHelper	helper=workbook.getCreationHelper();
	short format=helper.createDataFormat().getFormat("yyyy-DD-MM");
	    style.setDataFormat(format);
	    
		XSSFRow row0=sheet.createRow(0);    
		XSSFCell cell=row0.createCell(0); 	
		cell.setCellValue(Calendar.getInstance()); 
		cell.setCellStyle(style);
		
	   //How to read in console
		 System.out.println("Cell 0 : ");
	 System.out.println(cell.getDateCellValue());
	 
	 
	 CellStyle	style1=workbook.createCellStyle();
	 style1.setDataFormat(helper.createDataFormat().getFormat("dddd dd/MM/yy"));
	 		XSSFRow row1=sheet.createRow(1);    
			XSSFCell cell1=row1.createCell(0); 	
			cell1.setCellValue(new Date(31/01/2016)); 
			cell1.setCellStyle(style1);
			
		   //How to read in console
			 System.out.println("Cell 1 : ");
		 System.out.println(cell1.getDateCellValue());
		
	
	 
	 
	 
		
		 try {
				FileOutputStream output = new FileOutputStream("Date.xlsx");
			workbook.write(output);
			output.close();
			workbook.close();
			System.out.println("Alhamdulillah created ");
		      } catch (Exception e) {
				e.printStackTrace();
			}  

	}

}
