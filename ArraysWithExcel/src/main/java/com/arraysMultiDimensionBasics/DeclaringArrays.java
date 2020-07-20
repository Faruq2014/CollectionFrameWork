package com.arraysMultiDimensionBasics;

import org.testng.annotations.Test;

public class DeclaringArrays {
	//syntax:
	//Data_Type[][] Array_Name;
	
	int [][] anIntegerArray; // declaring an two dimensional array of Integers
	byte[][] anByteArray; // declaring an two dimensional array of Bytes
	short[][] anShortArray; // declaring an two dimensional array of Shorts
	long[][] anLongArray; // declaring an two dimensional array of Longs
	float[][] anFloatArray; // declaring an two dimensional array of Floats
	double[][] anDoubleArray; // declaring an two dimensional array of Doubles
	boolean[][] anBooleanArray; // declaring an two dimensional array of Booleans
	char[][] anCharArray; // declaring an two dimensional array of Chars
	String[][] anStringArray; // declaring an two dimensional array of Strings
	//Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
	
	
	
	
	@Test(priority = 1)
	public void intializing1() {
		int[][] salary = new int[3][3];
		// 2D int array with 3 rows and 3 columns
		// by default other value will be 0;
		salary[0][0] = 1000;
		salary[0][1] = 2000;
		salary[0][2] = 3000;
		int rows;
		int columns;
		for(rows = 0; rows < salary.length; rows++) {
			for(columns = 0; columns < salary[0].length; columns++) {
				System.out.format("%d \t", salary[rows][columns]);
				//System.out.println(salary);
			}
			//System.out.println("");
		}	
		
	}
	
	@Test(priority = 2)
	public void intializing2() {
		
		
		int[][] StudentArray = { {12, 22, 33},
								 {45, 65, 95},
								 {442, 444, 446},
								 {785, 786, 787}   };

		System.out.println("Element at StudentArray[0][0] = " + StudentArray[0][0]);
		System.out.println("Element at StudentArray[0][1] = " + StudentArray[0][1]);
		System.out.println("Element at StudentArray[0][2] = " + StudentArray[0][2]);
		System.out.println("Element at StudentArray[1][0] = " + StudentArray[1][0]);
		System.out.println("Element at StudentArray[1][1] = " + StudentArray[1][1]);
		System.out.println("Element at StudentArray[1][2] = " + StudentArray[1][2]);
		System.out.println("Element at StudentArray[2][0] = " + StudentArray[2][0]);
		System.out.println("Element at StudentArray[2][1] = " + StudentArray[2][1]);
		System.out.println("Element at StudentArray[2][2] = " + StudentArray[2][2]);
	}
	@Test(priority = 3)
	public   void intialize3() {
		int[][] a = { {15, 25, 35}, {45, 55, 65} };
		int[][] b = {{12, 22, 32}, {55, 25, 85} };
		int[][] Sum = new int[2][3];
		int rows, columns;
		
		for(rows = 0; rows < a.length; rows++) {
			for(columns = 0; columns < a[0].length; columns++) {
				Sum[rows][columns] = a[rows][columns] + b[rows][columns];  
			}			
		}
		System.out.println("Sum Of those Two Arrays are: ");
		for(rows = 0; rows < a.length; rows++) {
			for(columns = 0; columns < a[0].length; columns++) {
				System.out.format("%d \t", Sum[rows][columns]);
			}
			System.out.println("");
		}
		
	}
	
	@Test(priority = 4)
	public   void intialize4() {
		String[][] salutation = { {"Mr. ", "Mrs. ", "Ms. "},
				                  {"Molla"} }; 
		// Mr. Molla 
		System.out.println(salutation[0][0] + salutation[1][0]);
		// Mrs. Molla 
		System.out.println(salutation[0][1] + salutation[1][0]);
		}

	
	}
	
	

