package com.arraysSingleDimensionBasics;

import org.testng.annotations.Test;

public class BasicRulesOfSize {
	/*java arrays are fixed in size. you must declare the size. 
	 * for multidimensional array you must declare the row size.
	 * if you declare the size for 4 but only create 2, you can, 
	 * but remaining value will be default value of data type. 
	 */
	
	@Test
	public void fixedSized() {
		//java arrays are fixed in size. you must declare the size.
	
		int salary[]= new int[2]; //declaration, instantiation.
		
		salary[0]=4000; //initialization   of arrays
		salary[1]=5000;
		
		System.out.println(salary[0]);
		System.out.println(salary[1]);
	
		
		int wage[]={1000,2000};//declaration, instantiation and initialization 
		System.out.println(wage[0]);
		System.out.println(wage[1]);
		
		/*
		 * you size is 2, but if you declare extra than no compile time error but there
		 * will be a runtime error. java.lang.ArrayIndexOutOfBoundsException:
		 */
		
		//salary[2]=6000;
		
		//System.out.println(salary[2]);
	}
	
	@Test
	public void defaultValue() {
	String name [] = new String[4];	
	name [0]="faruq";
	name [1]="Shahin";
	//we only have two values declared, .......
	for (String i : name) {
		System.out.println(i);
	}
	
	char  alphabet []= new char[7];
	alphabet[0]='f'	; 
	alphabet[1]='a'	; 
	alphabet[2]='r'	; 
	alphabet[3]='u'	;
	alphabet[4]='q'	; 
	for (char c : alphabet) {
		System.out.println(c); 
		// the default value is space, after printig "q"  there will 2 sapce left.  
	}
	
	
	}
}
