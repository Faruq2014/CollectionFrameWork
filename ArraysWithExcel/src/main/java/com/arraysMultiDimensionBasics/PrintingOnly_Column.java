package com.arraysMultiDimensionBasics;

import org.testng.annotations.Test;

public class PrintingOnly_Column {

	int[][] num = {
			{1,2,3,4},
			{2,3,4,1},
			{3,2,1,4},
			{4,3,2,1}
	};
int i;
// printing each column require a individual loop 
	@Test
	public void printingColumn0() {
	for ( i = 0; i < num.length; i++) {
		System.out.println(num[i][0]+" ");
	}	
	
	System.out.println();
	}
	@Test
	public void printingColumn1() {
	for (i = 0; i < num.length; i++) {
		System.out.println(num[i][1]+" ");
	}	
	
	System.out.println();
	}
	
	@Test
	public void printingColumn2() {
	for (i = 0; i < num.length; i++) {
		System.out.println(num[i][2]+" ");
	}	
	
	System.out.println();
	}
	
	@Test
	public void printingColumn3() {
	for (i = 0; i < num.length; i++) {
		System.out.println(num[i][3]+" ");
	}	
	
	System.out.println();
	}
	
	
}
