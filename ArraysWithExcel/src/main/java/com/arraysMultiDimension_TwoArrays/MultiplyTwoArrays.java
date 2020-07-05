	package com.arraysMultiDimension_TwoArrays;
	
	public class MultiplyTwoArrays {
	
		public static void main(String[] args) {
			int[][] a = { {2, 2, 2},
					{3, 3, 3} };
	
			int[][] b = {{4, 4, 4}, 
					{5, 5, 5} };
	
			int[][] c = new int[2][3];
	
			for (int i = 0; i <2; i++) {
				for (int j = 0; j <3; j++) {
					c[i][j]=0;	
					for (int k = 0; k < a.length; k++) {
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
						//System.out.println(c[i][j]+",");
						//System.out.println("Name["+i+"]["+j+ "]:"+c[i][j]);
						//System.out.print(c[i][j]+"\t");
						//System.out.print(c[i][k]+"\t");
					}
					System.out.println();
				}
	
			}
			System.out.println("multiplication result");	
			for (int i = 0; i <2; i++) {
				for (int j = 0; j <3; j++) {
					//System.out.println(c[i][j]+"\t");
					System.out.println("Name["+i+"]["+j+ "]:"+c[i][j]);
				}
			}
	
	
	
		}
	
	}
