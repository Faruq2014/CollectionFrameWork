package com.arraysHowToCreateExcellFileBasics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToCreateMultipoleSheet {

	public static void main(String[] args) {
		Workbook workbook= new XSSFWorkbook(); //creating workbook
		// by default it will name sheet0.
        org.apache.poi.ss.usermodel.Sheet sheet1=workbook.createSheet();
        // Naming your sheet.
        org.apache.poi.ss.usermodel.Sheet sheet2=workbook.createSheet("Pancake");
        // some special character is not allow for excel naming convention. 
        // but using Workbook.Util method you can name anything.
        org.apache.poi.ss.usermodel.Sheet sheet3= workbook.createSheet(WorkbookUtil.createSafeSheetName("?()[]>$#%&^*Faruq1234"));
       // eventhogh referential variable name is mango, but it will take default name sheet3.
        org.apache.poi.ss.usermodel.Sheet mango=workbook.createSheet();
      try {
		FileOutputStream output = new FileOutputStream("MultipoleSheet.xlsx");
	workbook.write(output);
	output.close();
	System.out.println("Alhamdulillah created ");
      } catch (Exception e) {
		e.printStackTrace();
	}  
	}

}
