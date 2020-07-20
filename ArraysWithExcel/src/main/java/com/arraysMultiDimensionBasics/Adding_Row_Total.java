package com.arraysMultiDimensionBasics;

import org.testng.annotations.Test;

public class Adding_Row_Total {
	
	@Test(priority = 1)
	public void printRow() {
		int[][] num = {
				{1,2,3,4},
				{2,3,4,1},
				{3,2,1,4},
				{4,3,2,1}
		};
        System.err.println("printing row ");
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i][0]+",");
		}
		System.out.println();
		
	}
	

	@Test(priority = 2)
	public void rowTotal() {
		System.err.println("printing row total ");
		int[][] num = {
				{1,4,3,4},
				{2,3,2,0},
				{3,2,1,4},
				{4,3,2,1}
		};

		int rowTotal0=0;   int rowTotal1=0;
		for (int i = 0; i < num.length; i++) {
			rowTotal0 +=num[0][i];
			rowTotal1 +=num[1][i];
			
		}
		
		System.out.println("0th Row total "+rowTotal0);
		System.out.println("1st Row total "+rowTotal1);
	}
	
	@Test(priority = 3)
	public void jaggedrowTotal() {
		System.err.println("printing Jagged row total ");
		int[][] num = {
				{1,4,3,4},
				{2,3,2,0},
				{3,2,1},
				{4}
		};

	    int rowTotal2=0;
		for (int i = 0; i < num[2].length; i++) {
			rowTotal2 +=num[2][i];
			
		}
		System.out.println("3rd  Row total "+rowTotal2);
		
		
		 int rowTotal0=0;
			for (int i = 0; i < num[0].length; i++) {
				rowTotal0 +=num[0][i];
				
			}
		System.out.println("0th Row total "+rowTotal0);
		
		
		 int rowTotal3=0;
			for (int i = 0; i < num[3].length; i++) {
				rowTotal3 +=num[3][i];
				
			}
		System.out.println("4th Row total "+rowTotal3);
		
	}
	

	
	@Test(priority = 4)
	public void arrayTotal() {
		System.err.println("printing array total ");
		System.out.println();
		int[][] num = {
				{1,2,3,4},
				{2,3,4,1},
				{3,2,1,4},
				{4,3,2,1}
		};

		int total=0;
	

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				total += num[i][j];
			}
		}
		System.out.println("Array total "+total);

	}


}
