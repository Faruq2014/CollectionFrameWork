package com.arraysSorting_SingleArrays;

public class SortingPremetive_Descending {

	public static void main(String[] args) {
		descendingOrder2();

	}
	public static void descendingOrder2(){
		int array[]= {8,6,2,4,1,3,5,7,4};
		int sorting;
		for (int i = 0; i < array.length; i++) {
			for (int j =i+1; j < array.length; j++) {
			if (array[i]<array[j]) {
				sorting=array[i];
				array[i]=array[j];
				array[j]=sorting;
			}
			}
			System.out.println("descending----------->"+array[i]);

		}
	}
}
