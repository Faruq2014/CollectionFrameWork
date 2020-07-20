package com.arraysHowToCreate_MS_Doc;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Create_Paragraph {

	public static void main(String[] args) {
		  XWPFDocument doc = new XWPFDocument();  
	        try(OutputStream os = new FileOutputStream("Paragraph.doc")) {  
	            XWPFParagraph paragraph = doc.createParagraph();  
	            XWPFRun run = paragraph.createRun();  
				run.setText("Assalamualikum, This is Faruq Molla. Well come to "
			+ "Molla academy. I am very proud to have you as a student. As a teacher my "
			+ "job is not only teach you but mostly inspire you. make sure you are focus"
			+ "to achive your goal. Make sure you do not lose interest of learning."

			+ "As a student your job is learning. Remember it is not the teacher"
			+ "who teaches, preferably  it is the students who learn. If you do not "
			+ "want to learn, it is not posible for me to tesch you.");
			      doc.write(os); 
	            doc.close();
	        }catch(Exception e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  

	}


