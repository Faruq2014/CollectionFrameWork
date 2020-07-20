package com.arraysHowToCreateExcellFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.arraysHowToReadExcelFile.ExcelUtilsWithReturn;

public class ContactList {

	private static String[]	columns= {"firstName", "lastName", "emai", "dateOfBirthString"};
	
	private static List<Contact>contacts= new ArrayList<Contact>();
	
	public static void main(String[] args) throws IOException {
		contacts.add(new Contact("Faruq","Molla", "mm@g.com", "11/23/1999"));
		contacts.add(new Contact("Khaled","Molla", "mm@g.com", "11/23/1999"));
		contacts.add(new Contact("Arif","Molla", "mm@g.com", "11/23/1999"));
		contacts.add(new Contact("Fabiha","Molla", "mm@g.com", "11/23/1999"));
		contacts.add(new Contact("Faiza","Molla", "mm@g.com", "11/23/1999"));
		contacts.add(new Contact("Nisa","Molla", "mm@g.com", "11/23/1999"));
		
		// create workbook and sheet
				XSSFWorkbook workbook= new XSSFWorkbook();
				XSSFSheet sheet=workbook.createSheet("contacts");
			// for style	
			XSSFFont headerFont	=workbook.createFont();
			headerFont.setBold(true);
			headerFont.setFontHeightInPoints((short)15);
			headerFont.setColor(IndexedColors.RED.getIndex());
			
		CellStyle	headerCellStyle=workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		// create row 0, which is header
		XSSFRow headerRow=sheet.createRow(0);
		for (int i = 0; i < columns.length; i++) {
		Cell cell=headerRow.createCell(i);
		cell.setCellValue(columns[i]);
		cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum=1;
		for (Contact contact : contacts) {
			XSSFRow row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(contact.firstName);
			row.createCell(1).setCellValue(contact.lastName);
			row.createCell(2).setCellValue(contact.emai);
			row.createCell(3).setCellValue(contact.dateOfBirthString);
			
		}
		
		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}
		
		FileOutputStream fileOut= new FileOutputStream("contact.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
		System.out.println("created MashAllah");
		
		ExcelUtilsWithReturn ex= new ExcelUtilsWithReturn("contact.xlsx","contacts");
		System.out.println(ex.getRowCount());
		System.out.println(ex.getColCount());
		System.out.println(ex.getStringCellData(1, 3));
		System.out.println(ex.getNumericCellData(1, 3));
		
		ex.itreator();
		
		
	}
	

}







class Contact{
	public String firstName, lastName, emai, dateOfBirthString;

	public Contact(String firstName, String lastName, String emai, String dateOfBirthString) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emai = emai;
		this.dateOfBirthString = dateOfBirthString;
	}
}