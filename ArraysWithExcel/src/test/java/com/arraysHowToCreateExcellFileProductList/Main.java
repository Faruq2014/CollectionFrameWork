package com.arraysHowToCreateExcellFileProductList;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	public static void main(String[] args) {
	try {
		ProductModel pModel = new ProductModel();
		// create workbook and sheet
		XSSFWorkbook workbook= new XSSFWorkbook();  // creating new workbook
		//XSSFWorkbook workbook= new XSSFWorkbook("contact.xlsx");// working with existing one.
		XSSFSheet sheet=workbook.createSheet("List Product");
	// create header
		
		Row rowHeading=sheet.createRow(0);
		rowHeading.createCell(0).setCellValue("ID");
		rowHeading.createCell(1).setCellValue("Name");
		rowHeading.createCell(2).setCellValue("Creation Date");
		rowHeading.createCell(3).setCellValue("Price");
		rowHeading.createCell(4).setCellValue("Quantity");
		rowHeading.createCell(5).setCellValue("Sub Total");
		
		//create style
		//for (int i = 0; i <6; i++) // for manualy size of rowHeading
		//for (int i = 0; i <pModel.findAll().size()+1; i++)  for dynamic. +1 is for sub total
		
		for (int i = 0; i <6; i++) {
		CellStyle styleRowheading=workbook.createCellStyle();
		//for font bold and size
		XSSFFont font=workbook.createFont();
		font.setBold(true);
		font.setFontName(HSSFFont.FONT_ARIAL);
		font.setFontHeightInPoints((short)11);
		styleRowheading.setFont(font);
		styleRowheading.setAlignment(HorizontalAlignment.CENTER);
		styleRowheading.setVerticalAlignment(VerticalAlignment.CENTER);
		rowHeading.getCell(i).setCellStyle(styleRowheading);
		}
	//creating row
		int r=1;
	for (Product p : pModel.findAll()) {
		Row row=sheet.createRow(r);
		//Id Column
		Cell cellID=row.createCell(0);
		cellID.setCellValue(p.getId());
		
		//Name Column
				Cell cellName=row.createCell(1);
				cellName.setCellValue(p.getName());
				
				//Date Column
				Cell cellDate=row.createCell(2);
				cellDate.setCellValue(p.getCreationDate());
				
				//Price Column
				Cell cellPrice=row.createCell(3);
				cellPrice.setCellValue(p.getPrice());
				// formating price Data
				CellStyle stylePrice=workbook.createCellStyle();
				XSSFDataFormat cf=workbook.createDataFormat();
				stylePrice.setDataFormat(cf.getFormat("$#,##0.00"));
				cellPrice.setCellStyle(stylePrice);
				
				//Quantity Column
				Cell cellQuantity=row.createCell(4);
				cellQuantity.setCellValue(p.getQuantity());
				
				//SubTotal Column
				Cell cellSubTotal=row.createCell(5);
				cellSubTotal.setCellValue(p.getQuantity() * p.getPrice());
				// formattong Subtotal data
				CellStyle stylesub=workbook.createCellStyle();
				XSSFDataFormat sf=workbook.createDataFormat();
				stylesub.setDataFormat(sf.getFormat("$#,##0.00"));
				cellSubTotal.setCellStyle(stylePrice);
				
		r++;
	}
	
	//create total column
	 Row rowTotal=  sheet.createRow(pModel.findAll().size()+1);
	 Cell totalCell=rowTotal.createCell(0);
	 totalCell.setCellValue("Total Cost Of The Day");
	 // creating range for total column 
	//CellRangeAddress region=CellRangeAddress.valueOf("A6:E6");
	//sheet.addMergedRegion(region);
	
	CellStyle styleTotal=workbook.createCellStyle();
	
	//font bold size
	XSSFFont fontTotal=workbook.createFont();
	fontTotal.setBold(true);
	fontTotal.setFontName(HSSFFont.FONT_ARIAL);
	fontTotal.setFontHeightInPoints((short)11);
	fontTotal.setColor(IndexedColors.GREEN.getIndex());
	styleTotal.setFont(fontTotal);
	
	styleTotal.setVerticalAlignment(VerticalAlignment.CENTER);
	totalCell.setCellStyle(styleTotal);
	
	// Total Value of column 
	Cell cellTotalValue=rowTotal.createCell(5);
	cellTotalValue.setCellFormula("sum(F2:F6)");
	
	// formating total value
	XSSFDataFormat tf=workbook.createDataFormat();
	CellStyle TotalValue=workbook.createCellStyle();
	TotalValue.setDataFormat(tf.getFormat("$#,##0.00"));
	cellTotalValue.setCellStyle(TotalValue);
	
	
	//Auto Resize
		for (int i = 0; i <6; i++) {
		sheet.autoSizeColumn(i);
		
		}
		
	FileOutputStream out=new FileOutputStream("Product.xlsx");
	workbook.write(out);
	out.close();
	workbook.close();
	System.out.println("Alhamdulillah created");
	
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
