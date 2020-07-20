	package com.arraysHowToReadExcelFile;
	
	import java.io.FileInputStream;
	
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
	
	public class UtilLoop {
	
		/*
		 * public static void main(String[] args) { getData("Sheet1"); // no need main
		 * method, it is just to do unit testing. }
		 */
		
		static Workbook book;
		static org.apache.poi.ss.usermodel.Sheet sheet;
	
		public  Object[][] getData(String Workbook, String sheetName) {
			FileInputStream file = null;
			try {
				//file = new FileInputStream("./excel/data.xlsx");
				file = new FileInputStream(Workbook);
			} catch (Exception e) {
			}

			try {
					book = WorkbookFactory.create(file);
			} catch (Exception e) {
				// TODO: handle exception
			}
	
			sheet = book.getSheet(sheetName);
	
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			
			
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					System.out.print(data[i][j]+",   ");
				}
				System.out.println();
			}
	
			return data;
	
		}
	
	}
