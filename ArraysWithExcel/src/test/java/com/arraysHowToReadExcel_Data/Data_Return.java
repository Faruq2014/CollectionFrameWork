		package com.arraysHowToReadExcel_Data;
		
		import java.io.FileInputStream;
		import java.text.DateFormat;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		
		import org.apache.poi.hssf.usermodel.HSSFDateUtil;
		import org.apache.poi.ss.usermodel.CellType;
		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
		public class Data_Return {
			
		
			public FileInputStream fis=null;
			public  XSSFWorkbook workbook=null;
			public  XSSFSheet sheet=null;
			public  XSSFRow row=null;
			public  XSSFCell cell=null;
			
		
			public Data_Return(String excelPath)throws Exception  {
			
					fis=new FileInputStream(excelPath);
				 workbook = new XSSFWorkbook(fis);
				 fis.close();
				}
				
		public String getCellData(String sheetName, int RowNum,int colNum) {
			
			try {
				sheet=workbook.getSheet(sheetName);
				row=sheet.getRow(RowNum);
				cell=row.getCell(colNum);
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
					return"";
				else 
					return String.valueOf(cell.getBooleanCellValue());
					
				
				
			} catch (Exception e) {
			e.printStackTrace();
			return "No Match Value Found";
			}
			
		}
		
		
		
public String getCellData1(String sheetName,String colName, int rowNum) {
			
			try {
				int colNum=-1;
				sheet=workbook.getSheet(sheetName);
				row=sheet.getRow(0);
			for (int i = 0; i <row.getLastCellNum();  i++) {
				if (row.getCell(i).getStringCellValue().trim().equals(colName)) 
					colNum=i;
				
			}
			row=sheet.getRow(rowNum-1);
			cell=row.getCell(colNum);
			//return cell.getStringCellValue();
			
			
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
					return"";
				else 
					return String.valueOf(cell.getBooleanCellValue());
					
				
				
			} catch (Exception e) {
			e.printStackTrace();
			return "No Match Value Found";
			}
			
		}
		
			
		
		
			
			
			
		}
