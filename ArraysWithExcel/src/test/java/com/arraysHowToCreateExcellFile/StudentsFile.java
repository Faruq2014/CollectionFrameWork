package com.arraysHowToCreateExcellFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.arraysHowToReadExcelFile.NestedLoop;
import com.arraysHowToReadExcel_Data.Data_Return;
import com.arraysHowToReadExcel_Data.NestedLoop_Data;
import com.arraysHowTo_Search_ExcelFile.Search;

public class StudentsFile {
/*
 * Write a student file in Excel Sheet with four column: roll,name,pass semester.
 * make sure excel file has auto style and auto resize.
 */
	
	@Test
	public void createFile() {
		
		int[] roll=new int[10];
		for (int i = 0; i < roll.length; i++) {
			roll[i]=i+1;
		}
	
		String []name=new String[10];
		name[0]="Faruq";
		name[1]="Khaled";
		name[2]="Arif";
		name[3]="Habib";
		name[4]="Shimul";
		name[5]="Minhaz";
		name[6]="Habib";
		name[7]="Sarforaz kazi";
		name[8]="Shahin";
		name[9]="Kamal";
		
		String []result= new String[10];
		
		result[0]="pass";
		result[1]="pass";
		result[2]="pass";
		result[3]="pass";
		result[4]="pass";
		result[5]="fail";
		result[6]="pass";
		result[7]="pass";
		result[8]="pass";
		result[9]="fail";
		
		String []semister= new String[10];
		
		semister[0]="summer";
		semister[1]="summer";
		semister[2]="summer";
		semister[3]="summer";
		semister[4]="summer";
		semister[5]="summer";
		semister[6]="summer";
		semister[7]="summer";
		semister[8]="summer";
		semister[9]="summer and winter";
		
		// create workbook
		XSSFWorkbook workbook= new XSSFWorkbook();
		// create cell style
		CellStyle style=workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		
		XSSFFont headerFont	=workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short)15);
		headerFont.setColor(IndexedColors.RED.getIndex());
		style.setFont(headerFont);
		
		
		// create a spread sheet
		XSSFSheet sheet= workbook.createSheet("Results");
		//create row
		XSSFRow row;
		row=sheet.createRow(0);
	   Cell	cell0=row.createCell(0);
	   Cell	cell1=row.createCell(1);
	   Cell	cell2=row.createCell(2);
	   Cell	cell3=row.createCell(3);
	   
	   //Setting the Header value
	   cell0.setCellValue("roll");
	   cell1.setCellValue("name");
	   cell2.setCellValue("result");
	   cell3.setCellValue("semister");
	   // set header style
	   cell0.setCellStyle(style);
	   cell1.setCellStyle(style);
	   cell2.setCellStyle(style);
	   cell3.setCellStyle(style);
	   
	   // creating cell and row for data
	   
	   for (int i = 0; i < roll.length; i++) {
		   // for the header 0 index is taken, so begin with i+1
		row=sheet.createRow(i+1);
		for (int j = 0; j <4; j++) {
			Cell cell=	row.createCell(j);
			//cell.setCellStyle(style); // setting style for all the cell
			if (cell.getColumnIndex()==0) {
				cell.setCellValue(roll[i]);
			}
			else if (cell.getColumnIndex()==1) {
				cell.setCellValue(name[i]);
			}
			else if (cell.getColumnIndex()==2) {
				cell.setCellValue(result[i]);
			}
			else if (cell.getColumnIndex()==3) {
				cell.setCellValue(semister[i]);
			}
			
		}
		
	}
	// auto resize column
			for (int i = 0; i <4; i++) {
			sheet.autoSizeColumn(i);	
			}
	   
	 // write all the value in the file  
	
		try {
			FileOutputStream out= new FileOutputStream("Result.xlsx");
			workbook.write(out);
			out.close();
			System.out.println("Alhamdullillah created the Result file");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	
		
	}
	@Test
	public void readData() throws Exception {
		/*
		NestedLoop nl = new NestedLoop("Result.xlsx","Results");
		nl.getData();
		nl.getData1();
		//nl.getDataRow(0);
		//nl.getDataRow(1);
		nl.getDatacolumn(0);
	*/
		
		Data_Return dr=new Data_Return("Result.xlsx");
		System.out.println(dr.getCellData("Results", 1, 0));
		System.out.println(dr.getCellData("Results", 1, 1));
		System.out.println(dr.getCellData("Results", 1, 2));
		System.out.println(dr.getCellData("Results", 1, 3));
		
		System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(dr.getCellData1("Results", "name", 1));
		System.out.println(dr.getCellData1("Results", "name", 2));
		System.out.println(dr.getCellData1("Results", "name", 3));
		System.out.println(dr.getCellData1("Results", "name", 4));
		
		System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
		
		Search search= new Search("Result.xlsx","Results");
		search.getDatacolumn("Faruq");
		
	
	}
}
