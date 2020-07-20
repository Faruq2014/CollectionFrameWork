package com.arraysHowToCreate_MS_Doc;

import java.io.FileInputStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class Read_Paragraph {
	public static void main(String[] args) {
		
	
    try(FileInputStream fis = new FileInputStream("Style.docx")) {  
        XWPFDocument doc    = new XWPFDocument(OPCPackage.open(fis));  
        java.util.List<XWPFParagraph> paragraphs =  doc.getParagraphs();  
        for (XWPFParagraph i: paragraphs){  
            System.out.println(i.getText());  
        }  
    }catch(Exception e) {  
        System.out.println(e);  
    }  
}  
}
