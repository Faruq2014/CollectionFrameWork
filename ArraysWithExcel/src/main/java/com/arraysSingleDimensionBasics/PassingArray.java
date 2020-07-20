package com.arraysSingleDimensionBasics;

public class PassingArray {
	
	
	
	
	
	public static void main(String args[]){ 
		
		printArray(new int[]{10,22,44,66});//passing anonymous array to method  
		
		
		int a[]={33,1,4,5};//declaring and initializing an array 
		
		way_of_passing_an_array(a);//passing array to method  
		
		String[]  name={"khaled", "Kamal", "kasem"};
		
		name(name);
		
		
		name(new String[]{"kamal",""," "});
		}
	

	//Java Program to demonstrate the way of passing an anonymous array  
		//to method.  
		
		//creating a method which receives an array as a parameter  
		static void printArray(int arr[]){  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
		}  
		
		
	public static void  way_of_passing_an_array  (int arr[]) {
	//Java Program to demonstrate the way of passing an array 
 
			int min=arr[0];  
			for(int i=0;i<arr.length;i++)  
			 if(min>arr[i])  
			  min=arr[i];
			System.out.println(min+" is the minimum value of the array ");  
			int max = 0;
			for(int i=0;i<arr.length;i++) 
			if (arr[i] > max) max = arr[i];
		
			System.out.println(max+" is the max value of the array ");
	}
	
	
	public static void name(String name []) {
		
		
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
}
