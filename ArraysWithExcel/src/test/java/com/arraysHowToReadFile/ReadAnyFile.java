package com.arraysHowToReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadAnyFile {
	@Test
	public void test1() throws IOException {
		try {
			//BufferedReader bufferedReader= new BufferedReader(new FileReader("test.txt"));
			//BufferedReader bufferedReader= new BufferedReader(new FileReader("testng.xml"));
		BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\Faruq\\Desktop\\Faruq1.json"));
//BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\Faruq\\Desktop\\TEP-March to May\\email list.docx"
	//			));// can not read docx file. because it has to read by poi file.

			String line=null;
			while ((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
				
			}
			
			bufferedReader.close();	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
