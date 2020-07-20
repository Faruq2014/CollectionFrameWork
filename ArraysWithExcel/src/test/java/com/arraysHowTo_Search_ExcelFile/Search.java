		package com.arraysHowTo_Search_ExcelFile;
		
		import java.io.FileInputStream;
		
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		
		public class Search {
		
			static Workbook book;
			static org.apache.poi.ss.usermodel.Sheet sheet;
			FileInputStream file = null;
			
			
			     
		
			public Search(String path, String SheetName) {
				try {
					// file = new FileInputStream("./excel/data.xlsx");
					file = new FileInputStream(path);
					book = WorkbookFactory.create(file);
					sheet = book.getSheet(SheetName);
				} catch (Exception e) {
				}
			}
		
			
			
		
			public String[][] getDatacolumn(String element) {
				boolean isPresent=false;
				   Integer row=null;
				   Integer column=null;
		
				String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

				System.out.println("Search test");
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j <data[1].length; j++) {
						data[i][j] = sheet.getRow(i ).getCell(j).toString();
						if (data[i][j]==element) {
						System.out.println("The element name is: "+data[i][j]);
						isPresent =true;
						row=i;
						column=j;
				
						}
			                }
					}
					if (isPresent==true) {
						System.out.println(data[row][column] + "is present at   ");
						System.out.println("Cell[" + row + "][" + column + "]" );
					}else {System.out.println("not in the system");}
				
				
		
				return data;
		
			}
			
			

			public String[][] getDatacolumn1(String element) {
				boolean isPresent=false;
				   Integer row=null;
				   Integer column=null;
		
				String[][] data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

				System.out.println("Search test");
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
						data[i][j] = sheet.getRow(i ).getCell(j).toString();
						if (data[i][j]==element) {
						System.out.println("The element name is: "+data[i][j]);
						isPresent =true;
						row=i;
						column=j;
				
						}
			                }
					}
					if (isPresent==true) {
						System.out.println(data[row][column] + "is present at   ");
						System.out.println("Cell[" + row + "][" + column + "]" );
					}else {System.out.println("not in the system");}
				
				
		
				return data;
		
			}
			
			
			
		
		}
