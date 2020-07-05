package com.arraysMultiDimensionBasic_Search;

import org.testng.annotations.Test;

public class Linear_search {
	

	// there are two types of search technique in array
	// linear search and binary search.
	//linear search: each element will be compare with the given value
	// with a boolean flag. also called sequential search technique. 
	int[][] num = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{14,13,15,16}
	};
	
	boolean isPresent=false;
   Integer index=null;
     int number=10;
	@Test
	public void Equal() {
		System.out.println("equal test");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j]==number) {
				System.out.print(num[i][j]+",");
				isPresent =true;
				index=i;
				}
	                }
			}
			if (isPresent==true) {
				System.out.println("element is present at index "+index);
			}else {System.out.println("not in the system");}
		}
		
	@Test
	public void Greater() {
		System.out.println("Greater test");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j]>number) {
				System.out.println(num[i][j]+",");
				}
	                }
			}
			
		}

	@Test
	public void lessThan() {
		System.out.println("lessThan test");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j]<number) {
				System.out.println(num[i][j]+",");
				}
	                }
			}
			
		}

	}


