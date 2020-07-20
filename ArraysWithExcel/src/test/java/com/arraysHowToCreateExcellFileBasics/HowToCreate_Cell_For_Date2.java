package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreate_Cell_For_Date2 {

	public static void main(String[] args) {
		XSSFWorkbook workbook= new XSSFWorkbook();
		CreationHelper helper=	workbook.getCreationHelper();
		try {
			FileOutputStream output = new FileOutputStream("Date2.xlsx");
			XSSFSheet sheet=workbook.createSheet(); // working on default sheet0.
		XSSFRow  row0=	sheet.createRow(0);
		Cell cell0=row0.createCell(0);
		CellStyle style=workbook.createCellStyle();
		style.setDataFormat(helper.createDataFormat().getFormat("d/m/yy"));
		cell0=row0.createCell(1);
		cell0.setCellValue(new Date());
		cell0.setCellStyle(style);
		 workbook.write(output);
		//How to read in console
		 System.out.println("Cell 0 : ");
	 System.out.println(cell0.getDateCellValue());
	 
	
	 
		output.close();
		workbook.close();
	
		
			System.out.println("Alhamdulillah created ");
		      } catch (Exception e) {
				e.printStackTrace();
			}  

	}

}
