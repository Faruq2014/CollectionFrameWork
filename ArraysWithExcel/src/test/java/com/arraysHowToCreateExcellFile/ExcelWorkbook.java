package com.arraysHowToCreateExcellFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWorkbook {

	private static Workbook wb;
	private static org.apache.poi.ss.usermodel.Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;
	
	public static void main(String[] args) throws Exception, IOException {
	
		fis=new FileInputStream("ExcelWorkbook.xlsx");
          wb=WorkbookFactory.create(fis);
         sh=  wb.getSheet("Sheet");
        int noOfRows= sh.getLastRowNum();
        System.out.println(noOfRows);
        for (int i = 0; i < noOfRows; i++) {
        	System.out.println(sh.getRow(i).getCell(0));
        	System.out.println(sh.getRow(i).getCell(1));
       
        	row=sh.createRow(0);
        	cell=row.createCell(0);
        	cell.setCellValue("QAV");
        	System.out.println(cell.getStringCellValue());
        	fos=new FileOutputStream("ExcelWorkbook.xlsx");
        	wb.write(fos);
        	fos.flush();
        	fos.close();
        	System.out.println("done");
		
	}
	}

}
