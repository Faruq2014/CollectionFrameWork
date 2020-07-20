package com.arraysMultiDimensionBasic_Search;

import org.testng.annotations.Test;

public class Linear_search_String {
	

	// there are two types of search technique in array
	// linear search and binary search.
	//linear search: each element will be compare with the given value
	// with a boolean flag. also called sequential search technique. 
	String[][] name = {
			{"Faruq","Khaled","Shahin","Arif"},
			{"Shimul","Habib","Kazi","meenhaz"},
			{"Kamal","Rahat","Mojno","Mamun"}
	};
	
	boolean isPresent=false;
   Integer row=null;
   Integer column=null;
    String  student="Mamun";
     
	@Test
	public void Equal() {
		System.out.println("equal test");
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j <name[0].length; j++) {
				if (name[i][j]==student) {
				System.out.println("The student name is: "+name[i][j]);
				isPresent =true;
				row=i;
				column=j;
		
				}
	                }
			}
			if (isPresent==true) {
				System.out.println(name[row][column] + "is present at   ");
				System.out.println("Cell[" + row + "][" + column + "]" );
			}else {System.out.println("not in the system");}
		}

	}


