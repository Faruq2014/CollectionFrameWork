package com.arraysMultiDimensionFundamental;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SumOfDiaognal {
/*
 * write a program to input a square Matrix and print the sum of left and 
 * right diagonal elements.
 */
	
	@Test(priority = 1)
	public void createSquareMatrix() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the square matrix N x N");
		int n = in.nextInt();
		int a [][]=new int [n][n];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i <n; i++) 
			for (int j = 0; j <n; j++) 
			a[i][j]=in.nextInt();
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
				
		int sumL=0, sumR=0;
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
			if(i==j)
				sumL+=a[i][j];
			
			if(i+j==n-1)
				sumR+=a[i][j];
			}
		}
		System.out.println("Sum of Diaognals");
		System.out.println("Sum of left Diaognals = "+sumL);
		System.out.println("Sum of right Diaognals = "+sumR);
	}
}
