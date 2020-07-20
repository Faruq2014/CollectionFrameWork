		package com.arraysSingleDimensionBasics;
		
		public class BasicReturnArray {
			
		public static void main(String[] args) {
			
			int [] wages=get(); // returning a array as a method
			for (int i : wages) {
			//System.out.print(i+",");
			System.out.println(i);
			}
			System.out.println( "printing individually "+wages[0]);
		}
		
		//Java Program to return an array from the method  
		static int[] get(){  
		return new int[]{10,30,50,90,60};  
		}  
		}
