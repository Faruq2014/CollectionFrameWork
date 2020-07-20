package com.arraysHowToReadExcelFile;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NestedLoop {
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	FileInputStream file = null;
	
	public NestedLoop(String path, String SheetName ) {
		try {
			//file = new FileInputStream("./excel/data.xlsx");
			file = new FileInputStream(path);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(SheetName);
		} catch (Exception e) {
		}
	}
	
	public  Object[][] getData(){
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i ).getCell(j).toString();
				System.out.print(data[i][j]+",   ");
			}
			System.out.println();
		}

		return data;

	}
	
	
	public  Object[][] getData1(){
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			System.out.println("_________________");
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i ).getCell(j).toString();
				//System.out.print(data[i][j]+",   ");
				System.out.println("Cell["+i+"]["+j+"]:"+data[i][j]);	
				//System.out.println(data[i][j]);
			}
			System.out.println();
		}

		return data;

	}
	
	
	

	public  Object[][] getDataRow(int rowNumber){
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			System.out.print(data[rowNumber][i]);
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i ).getCell(j).toString();
				
			}
			System.out.println("  row is "+rowNumber);
		}

		return data;

	}
	
	
	public  Object[][] getDatacolumn(int colNumber){
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			System.out.print(data[i][colNumber]);
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i ).getCell(j).toString();
				
			}
			System.out.println("  row is "+colNumber);
		}

		return data;

	}
	
	
	}

