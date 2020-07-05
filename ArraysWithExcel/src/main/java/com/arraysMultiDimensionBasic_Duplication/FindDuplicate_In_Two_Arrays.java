package com.arraysMultiDimensionBasic_Duplication;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class FindDuplicate_In_Two_Arrays {
	
	
	@Test
	public void findDuplicate() {
		
		String name1[]= {"Faruq", "Khaled","Shahin","Shimul","Omar","Habib"};
		String name2[]= {"Faruq", "Khaled","Farid","Rafiq","Jewel","Mahmud"};
		
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		
		HashSet<String> hset= new HashSet<String>();
		for (int i = 0; i < name1.length; i++) {
			for (int j = 0; j < name2.length; j++) {
				if (name1[i].equals(name2[j])) {
					hset.add(name1[i]);
					System.out.println("the duplicate name is::"+ name1[i]);
				}
			}
		}
	}
	
	
	
	
}
