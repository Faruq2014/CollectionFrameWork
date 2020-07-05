package com.arraysMultiDimensionBasics;

import org.testng.annotations.Test;

public class SubTrackingRow_Column_Total {

	@Test
	public void rowTotal() {
		int[][] num = {
				{1,2,3,100},
				{2,3,1,100},
				{3,2,1,100},
				{4,3,2,100}
		};

		int rowTotal0=0;int rowTotal1=0;

		for (int i = 0; i < num.length; i++) {
			rowTotal0 -=num[0][i];
			rowTotal1 -=num[1][i];
		}
		System.out.println("0th Row Subtotal "+rowTotal0);
		System.out.println("1st Row Subtotal "+rowTotal1);
	}
	

	@Test
	public void columnTotal() {
		int[][] num = {
				{100,100,100,100},
				{2,3,4,1},
				{3,2,1,4},
			
		};

		int columnTotal0=0;
		int columnTotal1=0;

		for (int i = 0; i < num.length; i++) {
			columnTotal0 -=num[i][0];
			columnTotal1 -=num[i][1];
		}
		System.out.println("0th column total "+columnTotal0);
		System.out.println("1st column total "+columnTotal1);
	}
	
	@Test
	public void Total() {
		int[][] num = {
				{1,2,3,4},
				{2,3,4,1},
				{3,2,1,4},
				{4,3,2,1}
		};

		int total=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				total -= num[i][j];
			}
		}
		System.out.println("Array total "+total);

	}


}
