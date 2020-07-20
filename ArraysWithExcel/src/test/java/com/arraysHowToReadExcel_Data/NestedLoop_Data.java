package com.arraysHowToReadExcel_Data;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NestedLoop_Data {

	public FileInputStream fis=null;
	public  XSSFWorkbook workbook=null;
	public  XSSFSheet sheet=null;
	public  XSSFRow row=null;
	public  XSSFCell cell=null;
	
	
	//NOT WORKING
	
	
	public NestedLoop_Data(String excelPath) {
		try {

			fis=new FileInputStream(excelPath);
		 workbook = new XSSFWorkbook(fis);
		 fis.close();
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
	
	
	public  String getDatacolumn(String sheetName){
		//Integer rowNum,
		
		//Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < row.getLastCellNum(); i++) {
			//System.out.print(data[i][colNum]);
			for (int j = 0; j < i; j++) {
				String valuString= sheet.getRow(i ).getCell(j).toString();
				System.out.println("["+i+"]"+"["+j+"]"+" ="+ valuString);
				//start
				
				try {
					sheet=workbook.getSheet(sheetName);
					row=sheet.getRow(i);
					cell=row.getCell(j);
					if (cell.getCellTypeEnum()==CellType.STRING) {
					return cell.getStringCellValue();	
					}else if (cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA) {
					String cellValue =String.valueOf(cell.getNumericCellValue());
					if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat dt=	new SimpleDateFormat("dd/MM/yy");
					Date date =cell.getDateCellValue();
					cellValue =dt.format(date);
					}
					return cellValue;
					}
					else if (cell.getCellTypeEnum()==CellType.BLANK)
						return" ";
					else 
						return String.valueOf(cell.getBooleanCellValue());
						
					
					
				} catch (Exception e) {
				e.printStackTrace();
				return "No Match Value Found";
				}
				
				//finish
				
				
			}
			System.out.println();
		}
		return sheetName;

		//return data;

	}
	
	
	}

