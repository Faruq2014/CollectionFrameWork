package com.arraysHowToCreate_MS_Doc;

import java.io.FileInputStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Read_Text {

	public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("Style.docx")) {  
            XWPFDocument file   = new XWPFDocument(OPCPackage.open(fis));  
            XWPFWordExtractor ext = new XWPFWordExtractor(file);  
            System.out.println(ext.getText()); 
            ext.close();
        }catch(Exception e) {  
            System.out.println(e);  
        }  

	}

}
