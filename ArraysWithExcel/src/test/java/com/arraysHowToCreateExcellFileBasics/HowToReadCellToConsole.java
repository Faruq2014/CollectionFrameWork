package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToReadCellToConsole {

	public static void main(String[] args) {
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet(); // working on default sheet0.
		XSSFRow row=sheet.createRow(0);    // create row
		XSSFCell cell=row.createCell(0); 	// create cell
		cell.setCellValue("User Nmae");      // set cell value
		
		XSSFCell cell1=row.createCell(1); 	// create cell
		cell1.setCellValue("Faruq");
		
	  //How to read in console
		 System.out.println("How to read in console: ");
	 System.out.println(cell.getRichStringCellValue().toString());
	 
	String data= cell1.getRichStringCellValue().toString();
	 System.out.println(data);
		
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
