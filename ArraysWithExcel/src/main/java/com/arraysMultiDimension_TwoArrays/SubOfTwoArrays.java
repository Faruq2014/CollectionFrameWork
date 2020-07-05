package com.arraysMultiDimension_TwoArrays;

import org.testng.annotations.Test;

public class SubOfTwoArrays {
	@Test
	public void subbing() {
	int[][] a = { {5, 5, 5}, {5, 5, 5} };
	int[][] b = {{2, 2, 2}, {5, 5, 5} };
	int[][] c = new int[2][3];
	
	
	for (int i = 0; i <a.length; i++) {
	for (int j= 0;j <3; j++) {
		c[i][j]=a[i][j]-b[i][j];
		System.out.print(c[i][j]+"\t");
	}
	System.out.println();
	}
}
	
	@Test
	public void addingString() {
	String[][] a = { {"Faruq", "Fabiha", "Faiza"},
			      {"Zakir", "Rafid", "Rayan"} };
	
	String[][] b = {{" Molla", " Molla", " Molla"},
			     {" Bhuiyan", " Bhuiyan", " Bhuiyan"} };
	String[][] c = new String[2][3];
	
	
	for (int i = 0; i <2; i++) {	
	for (int j= 0;j <3; j++) {
		//c[i][j]=a[i][j]-b[i][j]; // can not substruct between two strin arrays
		c[i][j]=a[i][j]+b[i][j];
		//System.out.print(c[i][j]+",");
		System.out.println("Name["+i+"]["+j+ "]:"+c[i][j]);
	}
	System.out.println();
	}
}
}
