package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToStyleCell {

	public static void main(String[] args) throws Throwable {
		
		Workbook workbook= new XSSFWorkbook ();
		org.apache.poi.ss.usermodel.Sheet sheet=workbook.createSheet("Eggs");
		
            Cell cell1=sheet.createRow(0).createCell(0);
            Cell cell2=sheet.createRow(1).createCell(0);
            Cell cell3=sheet.createRow(2).createCell(0);
            Cell cell4=sheet.createRow(3).createCell(0);
            Cell cell5=sheet.createRow(4).createCell(0);
         
            
           System.out.println("Back Ground");
           cell1.setCellValue("WELCOME");
           cell2.setCellValue("THANK YOU");
           
         CellStyle  styleBackground=workbook.createCellStyle(); // create style variable
         
         styleBackground.setFillForegroundColor(IndexedColors.BROWN.getIndex());
          styleBackground.setFillPattern(FillPatternType.SOLID_FOREGROUND);
         // back ground style is ready to assign to any variable
          
          cell1.setCellStyle(styleBackground);
          cell2.setCellStyle(styleBackground);
          
          // there are lots of back ground stuff you can do.
           System.out.println("Alhamdulillah Back Ground done");
           
           System.out.println("Working on Font");
           cell3.setCellValue("MY PLEASURE");
           
           Font font= workbook.createFont();
           
           
           CellStyle  styleFont=workbook.createCellStyle();
           
           font.setColor(IndexedColors.BLUE.getIndex());
           font.setItalic(true);
           font.setBold(true);
           font.setFontHeightInPoints((short)15);
           font.setUnderline(font.U_DOUBLE);
           font.setFontName("Algerian" );
           
           
           styleFont.setFont(font); // set font to style variable
           
           cell3.setCellStyle(styleFont); // assign style variable to a cell
           System.out.println("you can do a lot more on Font");
        
           
           System.out.println("Working on BORDER");
           cell4.setCellValue("MENTION");
           CellStyle  styleBorder=workbook.createCellStyle();
           styleBorder.setBorderTop(BorderStyle.THICK);
           styleBorder.setBorderBottom(BorderStyle.DOTTED);
           styleBorder.setBottomBorderColor(IndexedColors.GOLD.getIndex());
           styleBorder.setTopBorderColor(IndexedColors.GOLD.getIndex());
          cell4.setCellStyle(styleBorder);
           
           
           System.out.println("Working on ALIGNMENT");
           cell5.setCellValue("We love you");
           CellStyle  styleAlignment=workbook.createCellStyle();
           styleAlignment.setVerticalAlignment(VerticalAlignment.CENTER);
           cell5.setCellStyle(styleAlignment);
           System.out.println("Lot mor you can do on ALIGNMENT");
           
           
	// creating another sheet
		org.apache.poi.ss.usermodel.Sheet sheet1=workbook.createSheet("chickens");
		System.out.println("Styling Sheet Two");
            Cell scell1=sheet1.createRow(0).createCell(0);
            Cell scell2=sheet1.createRow(1).createCell(0);
           
            
            
            scell1.setCellValue("We love you");
           scell1.setCellStyle(styleFont);  // even though 4 style variable is ready, only one
                                                    // can use at a time.
           // scell1.setCellStyle(styleAlignment);
          //  scell1.setCellStyle(styleBackground);
          //  scell1.setCellStyle(styleBorder);
           
           
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
           font1.setUnderline(font.U_DOUBLE);
           font1.setFontName("Algerian" );
           style.setFont(font1); // set font to style variable
           scell2.setCellStyle(style); // assign style variable to a cell
           
            
           
           FileOutputStream output = new FileOutputStream("StyleSheet.xlsx");
           workbook.write(output);
           output.close();
           workbook.close();
           System.out.println("Alhamdulillah  done");
	}

}
