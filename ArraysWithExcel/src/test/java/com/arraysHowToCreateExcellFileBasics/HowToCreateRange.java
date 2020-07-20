package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreateRange {

	public static void main(String[] args) throws Throwable {

		
		Workbook workbook= new XSSFWorkbook ();
		org.apache.poi.ss.usermodel.Sheet sheet=workbook.createSheet("Eggs");
		
            Cell cell1=sheet.createRow(0).createCell(0);
            Cell cell2=sheet.createRow(1).createCell(0);
            Cell cell3=sheet.createRow(2).createCell(0);
           
            // how to set column with
           System.out.println("Setting column range");
           cell1.getRow().setHeightInPoints(30); // creating column range
           cell2.getRow().setHeightInPoints(40);
           cell3.getRow().setHeightInPoints(50);
           
           cell1.setCellValue("WELCOME");
           cell2.setCellValue("THANK YOU");
      
       
	// creating another sheet
		org.apache.poi.ss.usermodel.Sheet sheet1=workbook.createSheet("chickens");
		System.out.println("Styling Sheet Two"); 
		System.out.println("Setting row range");
		sheet1.setColumnWidth(0, 8000);  // creating column range
            Cell scell1=sheet1.createRow(0).createCell(0);
            Cell scell2=sheet1.createRow(1).createCell(0);
           
            
            
            scell1.setCellValue("We love you");
        
           scell2.setCellValue("Thankyou");
           Font font1= workbook.createFont();
           CellStyle  style=workbook.createCellStyle();
           // Alignment
           style.setVerticalAlignment(VerticalAlignment.CENTER);
           //border
           style.setBorderTop(BorderStyle.THICK);
           style.setBorderBottom(BorderStyle.DOTTED);
           style.setBottomBorderColor(IndexedColors.GOLD.getIndex());
           style.setTopBorderColor(IndexedColors.GOLD.getIndex());
           //font
           font1.setColor(IndexedColors.RED.getIndex());
           font1.setItalic(true);
           font1.setBold(true);
           font1.setFontHeightInPoints((short)15);
        //   font1.setUnderline(font.U_DOUBLE);
           font1.setFontName("Algerian" );
           style.setFont(font1); // set font to style variable
           scell2.setCellStyle(style); // assign style variable to a cell
           
           // creating another sheet
      		org.apache.poi.ss.usermodel.Sheet sheet2=workbook.createSheet("Ducks");
      	// creating  range with sheet
      		sheet2.addMergedRegion(new CellRangeAddress(/*row*/ 0,4, /* column*/ 0,4));
      		Cell dcell=sheet2.createRow(0).createCell(0);
      		dcell.setCellValue("WELCOME");
      		
      		
           FileOutputStream output = new FileOutputStream("Range.xlsx");
           workbook.write(output);
           output.close();
           workbook.close();
           System.out.println("Alhamdulillah second formula done");
           
      
	}

}
