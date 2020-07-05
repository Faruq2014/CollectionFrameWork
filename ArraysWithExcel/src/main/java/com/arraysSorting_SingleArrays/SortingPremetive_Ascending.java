package com.arraysSorting_SingleArrays;

import java.util.Arrays;

public class SortingPremetive_Ascending {

	public static void main(String[] args) {
		AscendingOrder1();
		AscendingOrder2();
	}

	

	public static void AscendingOrder1(){

		int array[]= {8,6,2,4,1,3,5,7,4};
		Arrays.sort(array);
		System.out.println("you must put -1 from the length to print all the value of index. ");
		for (int i = 0; i<= array.length-1; i++) {
			System.out.println(array[i]);
		}

       
	}
	
	public static void AscendingOrder2(){
		int array[]= {8,6,2,4,1,3,5,7,4};
		int sorting;
		for (int i = 0; i < array.length; i++) {
			for (int j =i+1; j < array.length; j++) {
			if (array[i]>array[j]) {
				sorting=array[i];
				array[i]=array[j];
				array[j]=sorting;
			}
			}
			System.out.println("ascending----------->"+array[i]);
		}
	}

}
