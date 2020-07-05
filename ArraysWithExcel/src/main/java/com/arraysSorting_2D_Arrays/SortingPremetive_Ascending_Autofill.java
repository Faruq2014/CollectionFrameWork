package com.arraysSorting_2D_Arrays;

public class SortingPremetive_Ascending_Autofill {

	public static void main(String[] args) {
		// auto fill reverse order
		int [][] a= new int[10][10];
		int count=1;
		for (int row = a.length-1; row >=0; row--) {
			for (int col = a[0].length-1; col>=0 ; col--) {
				a[row][col]=count;
				count++;
			}
		}

		//sorting in in order
	for (int rs = 0; rs < a.length; rs++) {
		for (int cs = 0; cs < a.length; cs++) {
			for (int r = 0; r < a.length; r++) {
				for (int c = 0; c < a.length; c++) {
				int sort;
				if (a[rs][cs]<a[r][c]) {
					sort=a[rs][cs];
					a[rs][cs]=a[r][c];
					a[r][c]=sort;
				}
				}
			}
		}
	}
	// printing array
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}

}
