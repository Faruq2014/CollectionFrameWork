package com.arraysSorting_2D_Arrays;

public class SortingPremetive_Ascending {

	public static void main(String[] args) {
	int a[][]= {
			{7,4,6},
			{9,5,8},
			{2,1,3}
			  };

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
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}

}
