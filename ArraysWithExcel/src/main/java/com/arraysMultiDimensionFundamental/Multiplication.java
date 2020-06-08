package com.arraysMultiDimensionFundamental;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Multiplication {
	
	
	@Test
	public void multiplicationTest() {
		System.out.println("number of column of first array must be equal to number of rows of second array");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the First square matrix N x N");
		int n = in.nextInt();
		int a [][]=new int [n][n];

		int c[][],i,j,k;
		
		
		System.out.println("Enter the elements of First square matrix");
		for ( i = 0; i <n; i++) 
			for ( j = 0; j <n; j++) 
			a[i][j]=in.nextInt();
		
		System.out.println(" the First matrix is :");
		for ( i = 0; i <n; i++) {
			for ( j = 0; j <n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	
		
		// second matrix
		System.out.println("Enter the Size of the second square matrix N x N");
		int n1 = in.nextInt();
		int b [][]=new int [n1][n1];
		
		System.out.println("Enter the elements of second matrix");
		for ( i = 0; i <n1; i++) 
			for ( j = 0; j <n1; j++) 
			b[i][j]=in.nextInt();
		
		
		
		System.out.println(" the second matrix are: ");
		for ( i = 0; i <n1; i++) {
			for ( j = 0; j <n1; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		
		c= new int [n][n];
		System.out.println("Multiply two arrays");
		for (i = 0; i <n; i++) {
		for (j= 0;j <n; j++) {
		//c[i][j]=0;	
		for ( k = 0; k <n; k++) {
			
			c[i][j]=c[i][j]+a[i][k]* b[k][j];
			
		}
		}
		
		}
		System.out.println("Multiplication Results Are: ");
		for (i= 0; i <n; i++) {
		for (j = 0; j <n;j++) {
		System.out.print(c[i][j]+"\t");	
		}	
		System.out.println();
		}
			
	}
	
}
