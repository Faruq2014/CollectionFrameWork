package com.arraysSingleDimensionBasics;

import org.testng.annotations.Test;

public class DeclaringArrays {

	/*Syntax :
	 * dataType[] arrayRefVar;  preferred way. 
	 * or dataType arrayRefVar[]. // works but not preferred way.
	 * dataType[] arrayRefVar = new dataType[arraySize];
	 * dataType[] arrayRefVar = {value0, value1, ..., valuek};
	 */

	@Test(priority = 1)
	public void intialize1() {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
	}
	@Test(priority = 2)
	public void intialize2() {
		double[] myList = new double [4];
		//double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		myList[0]=1.9;
		myList[1]=2.9;
		myList[2]=3.4;
		myList[3]=3.5;

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
	}
	
	@Test(priority = 3)
	public void SummingAllElements() {
		double[] salary = { 80000, 60000.9, 39000.4, 43000.5 };
		 double total = 0;
	      for (int i = 0; i < salary.length; i++) {
	         total += salary[i];
	      }
	      System.out.println("Total is " + total);
	}
	
	@Test(priority = 4)
	public void FindingTheLargestElement() {
		double[] salary = { 80000, 60000.9, 39000.4, 43000.5 };
		 double max = 0;
	      for (int i = 0; i < salary.length; i++) {
	    	  if (salary[i] > max) max = salary[i];
	      }
	      System.out.println("max is " + max);
	}
	
	@Test(priority = 5)
	public void forEachLoop() {
		double[] salary = { 80000, 60000.9, 39000.4, 43000.5 };
		 for (double element: salary) {
	         System.out.println("For each loop is " + element);
	      }
		
	}
}
