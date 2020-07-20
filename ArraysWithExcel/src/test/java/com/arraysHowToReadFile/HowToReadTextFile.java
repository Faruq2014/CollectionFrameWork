package com.arraysHowToReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowToReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// File file = new File("test.txt");
         //File file = new File("testng.xml");
		File file = new File("C:/Users/Faruq/Desktop/Faruq1.json");
		Scanner scan = new Scanner(file);

		while (scan.hasNextLine()) {

			System.out.println(scan.nextLine());

		}
		scan.close();
	}

}
