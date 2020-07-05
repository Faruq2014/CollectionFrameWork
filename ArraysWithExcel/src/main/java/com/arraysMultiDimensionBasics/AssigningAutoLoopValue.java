		package com.arraysMultiDimensionBasics;
		
		public class AssigningAutoLoopValue {
		
			public static void main(String[] args) {
				
		int mul2d[][]=new int [4][5];
		int i,  j, k=0;
		for (i=0; i<4; i++) {
		for (j=0; j<5; j++) {
			mul2d[i][j]=k;
			k++;
		}
		for (i = 0; i < 4; i++) {
			for (j = 0;  j< 5; j++) {
			System.out.println(mul2d[i][j]+ " ");	
			System.out.println();
			}
			
		}
		}
			}
		
		}
