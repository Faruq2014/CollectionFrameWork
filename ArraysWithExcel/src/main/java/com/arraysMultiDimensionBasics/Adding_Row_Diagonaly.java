package com.arraysMultiDimensionBasics;

public class Adding_Row_Diagonaly {
	int[][] num = {
			{1,2,3,4},
			{2,3,4,1},
			{3,2,1,4},
			{4,3,2,1}
	};
	
	int sumOfleftDiagonal;
	int sumOfRightDiagonal=0;
	
	public static void main(String[] args) {
		new Adding_Row_Diagonaly().diagnal();

	}


	public int diagnal() {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + "\t");
				
			if (i==j) sumOfleftDiagonal +=num[i][j];
			if (i+j==num.length-1) sumOfRightDiagonal +=num[i][j]; 
						}
			System.out.println();
		}
		System.out.println("Sum of Diaognals");
		System.out.println("Sum of left Diaognals = "+sumOfleftDiagonal);
		System.out.println("Sum of right Diaognals = "+sumOfRightDiagonal);
		
		
		return 0;
		
	}
}
