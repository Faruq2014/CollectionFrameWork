package com.arraysHowToCreate_MS_Doc;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class Create_Table {

    public static void main(String[] args)throws Exception {  
          XWPFDocument document= new XWPFDocument();  
          try(FileOutputStream out = new FileOutputStream(new File("Table.docx"))){  
              // Creating Table  
              XWPFTable table = document.createTable();  
              XWPFTableRow row = table.getRow(0); // First row  
              // Columns  
              row.getCell(0).setText("Student. No.");  
              row.addNewTableCell().setText("Name");  
              row.addNewTableCell().setText("Email"); 
              
              row = table.createRow(); // Second Row  
              row.getCell(0).setText("101");  
              row.getCell(1).setText("Habib");  
              row.getCell(2).setText("habib@gmail.com"); 
              
              row = table.createRow(); // Third Row  
              row.getCell(0).setText("102");  
              row.getCell(1).setText("Shimul");  
              row.getCell(2).setText("Shimul@gmail.com");  
              
              row = table.createRow(); // Fourth Row  
              row.getCell(0).setText("103");  
              row.getCell(1).setText("Arif");  
              row.getCell(2).setText("Arif@gmail.com");  
              
              row = table.createRow(); // Fourth Row  
              row.getCell(0).setText("104");  
              row.getCell(1).setText("Kamal");  
              row.getCell(2).setText("Kamal@gmail.com");  
              
              document.write(out); 
              System.out.println("Alhamdulillah created");
              document.close();
          }catch(Exception e) {  
              System.out.println(e);  
          }  
       }  
}
