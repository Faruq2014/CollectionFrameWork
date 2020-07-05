package com.arraysMultiDimensionBasics;

import org.testng.annotations.Test;

public class Megging_TwoArrays_IntoOne {

	@Test
	public void PrimitiveType() {
		int [] arr1= {11,12,13,14};
		int [] arr2= {15,16,17,18};
		int merge[]=new int[arr1.length+arr2.length];
		int c=0;
		for (int i = 0; i < arr1.length; i++) {
			merge[i]=arr1[i];
			c++;
		}
		for (int j = 0; j < arr2.length; j++) {
		merge[c++]	=arr2[j];
		}
		for (int i = 0; i < merge.length; i++) {
			//System.out.print(merge[i]+",");
			System.out.println("Name["+i+"]"+merge[i]);
		}

}
	
	@Test
	public void StringType() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>................");
		String [] arr1= {"Faruq","Fabiha","Faiza"};
		String [] arr2= {"Khaled","Farid","Shimul","Arif"};
		String merge[]=new String[arr1.length+arr2.length];
		int c=0;
		for (int i = 0; i < arr1.length; i++) {
			merge[i]=arr1[i];
			c++;
		}
		for (int j = 0; j < arr2.length; j++) {
		merge[c++]	=arr2[j];
		}
		for (int i = 0; i < merge.length; i++) {
			//System.out.print(merge[i]+",");
			System.out.println("Name["+i+"]"+merge[i]);
		}

}
	
}
