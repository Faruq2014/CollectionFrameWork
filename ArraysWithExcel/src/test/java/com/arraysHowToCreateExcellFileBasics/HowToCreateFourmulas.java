package com.arraysHowToCreateExcellFileBasics;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreateFourmulas {

	public static void main(String[] args) throws Throwable {
		
		Workbook workbook= new XSSFWorkbook ();
		org.apache.poi.ss.usermodel.Sheet sheet=workbook.createSheet("Eggs");
		
            Cell cell1=sheet.createRow(0).createCell(0);
            Cell cell2=sheet.createRow(1).createCell(0);
            Cell cell3=sheet.createRow(2).createCell(0);
            Cell cell4=sheet.createRow(3).createCell(0);
            Cell cell5=sheet.createRow(4).createCell(0);
           System.out.println("Fourmula one");
           cell1.setCellValue(5);
           cell2.setCellValue("+");
           cell3.setCellValue(10);
           cell4.setCellValue("=");
           cell5.setCellFormula("A1+A3");
           System.out.println(cell5.getCellFormula()+" first formula");
           // you must put number cell, such as A1 and A3 has numeric value,
           // this formula only take numeric value.
      
           System.out.println("Alhamdulillah first formula done");
	
	// creating another sheet
		org.apache.poi.ss.usermodel.Sheet sheet1=workbook.createSheet("chickens");
		
            Cell scell1=sheet1.createRow(0).createCell(0);
            Cell scell2=sheet1.createRow(1).createCell(0);
            Cell scell3=sheet1.createRow(2).createCell(0);
            Cell scell4=sheet1.createRow(3).createCell(0);
            Cell scell5=sheet1.createRow(4).createCell(0);
            
            System.out.println("Fourmula two");
           scell1.setCellValue(10);
           scell2.setCellValue(10);
           scell3.setCellValue("hh");
           scell4.setCellValue(10);
           scell5.setCellFormula("SUM(A1:A4)");
           
           System.out.println(scell5.getCellFormula()+" second formula: ");
           System.out.println(scell5.getColumnIndex()+" column index");
           System.out.println(scell5.getRowIndex()+" row index");
           System.out.println(scell5.getCachedFormulaResultType()+" scell5 FormulaResultType ");
           System.out.println(scell4.getNumericCellValue()+" scell4");
           System.out.println(scell4.getAddress()+" scell4 address");
           System.out.println(scell4.getCellType()+" scell4 type");
           System.out.println(scell4.getDateCellValue()+" scell4 DateCellValue");
          
           
           // you must put range of cell, such as A1 and A4. 
           // this formula take numeric value and any data type, .
           // other data count as 0.
           FileOutputStream output = new FileOutputStream("Formula.xlsx");
           workbook.write(output);
           output.close();
           workbook.close();
           System.out.println("Alhamdulillah second formula done");
	}

}
