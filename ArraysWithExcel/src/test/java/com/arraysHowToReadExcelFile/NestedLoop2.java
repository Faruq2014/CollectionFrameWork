		package com.arraysHowToReadExcelFile;
		
		import java.io.FileInputStream;
		
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		
		public class NestedLoop2 {
		
			static Workbook book;
			static org.apache.poi.ss.usermodel.Sheet sheet;
			FileInputStream file = null;
		
			public NestedLoop2(String path, String SheetName) {
				try {
					// file = new FileInputStream("./excel/data.xlsx");
					file = new FileInputStream(path);
					book = WorkbookFactory.create(file);
					sheet = book.getSheet(SheetName);
				} catch (Exception e) {
				}
			}
		
			public Object[][] getData() {
				Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					System.out.println("_________________");
					for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
						data[i][j] = sheet.getRow(i).getCell(j).toString();
						// System.out.print(data[i][j]+", ");
						System.out.println("Cell[" + i + "][" + j + "]:" + data[i][j]);
						// System.out.println(data[i][j]);
					}
					System.out.println();
				}
		
				return data;
		
			}
		
			public String[][] getDataRow() {
				String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
				System.out.println("<<<<<<<<<<<<<<<Sum of row for  array>>>>>>>>>>>>>>>>>>>>>");
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
		
					System.out.println("the row number " + (i + 1));
					for (int j = 0; j < data[i].length; j++) {
						data[i][j] = sheet.getRow(i).getCell(j).toString();
						System.out.print(data[i][j] + ",  ");
		
					}
					System.out.println();
				}
				return data;
			}
		
			public String[][] getDatacolumn() {
				String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
				System.out.println(">>>>>>>>>>>>>>>>>The column for Products array>>>>>>>>>>>>>>>>>>");
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					System.out.println(" column " + (i + 1) + " is : ");
					for (int j = 0; j < data[i].length; j++) {
						data[i][j] = sheet.getRow(i).getCell(j).toString();
						System.out.println(data[j][i] + " ");
		
					}
					// System.out.println(" column "+(i+1)+" is : ");
				}
		
				return data;
		
			}
		
		}
