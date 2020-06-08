package com.arraysMultiDimensionFundamental;

import java.util.Scanner;

import org.testng.annotations.Test;

public class AddSubDifferentArrays {

	@Test(priority = 1)
	public void AddSub() {
		int a[][],b[][],c[][],i,j;
		a= new int [3][3];
		b= new int [3][3];
		c= new int [3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the First square matrix N x N");
		for ( i = 0; i <3; i++) 
			for ( j = 0; j <3; j++) 
			a[i][j]=in.nextInt();
		
		System.out.println("Enter the Size of the second square matrix N x N");
		for ( i = 0; i <3; i++) 
			for ( j = 0; j <3; j++) 
			b[i][j]=in.nextInt();
		
		System.out.println("Addition two arrays");
		for (i = 0; i <3; i++) {
		for (j= 0;j <3; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		}
		
		System.out.println("substraction two arrays");
		for (i = 0; i <3; i++) {
		for (j= 0;j <3; j++) {
			c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		}
		
	}
}
