package com.arraysSorting_SingleArrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingStringValue {
static String name[]= {"Berry","Apple","Date","Cherry"}; // Declaring array static for easier access.

	public static void main(String[] args) {
		asscendingOrder();	
		
		String letter[]= {"d","b","a","c"};//declaring local array and passing as a parameter. 
		descendingOrder(letter);
	}
	
	public static void asscendingOrder() {
		System.out.println("asscendingOrder: ");
		Arrays.sort(name);
		for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);	
		}
	}
	
	public static void descendingOrder(String [] array) { //passing array as a parameter(dynamic coding)
		System.out.println("descendingOrder:  ");
		Arrays.sort(array, Collections.reverseOrder());
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);	
		}
	}

}
