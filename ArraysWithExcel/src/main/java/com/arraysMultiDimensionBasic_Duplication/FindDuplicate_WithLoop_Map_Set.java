		package com.arraysMultiDimensionBasic_Duplication;
		
		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Set;
		
		import org.testng.annotations.Test;
		
		public class FindDuplicate_WithLoop_Map_Set {
			String names[]= {"Faruq", "Khaled","Shahin","Shimul","Faruq","Khaled"};
		
			@Test
			public void findDuplicateWithLoop() {
				System.out.println("<<<<<<<<<<<using LOOP>>>>>>>>>>>>>>>>>>>>>>>");
				for (int i = 0; i < names.length; i++) {
					for (int j = i+1; j < names.length; j++) {
						if (names[i].equals(names[j])&& i!=j) {
							System.out.println("the duplicate name is::"+ names[i]);	
						}	
					}
				}
				System.out.println(); // just for empty space
			}
			
			@Test
			public void findDuplicateNumericWithLoop() {
				System.out.println("<<<<<<<<<<<using Numeric LOOP>>>>>>>>>>>>>>>>>>>>>>>");
				int names[]= {10, 12,13,15,13,11};
				for (int i = 0; i < names.length; i++) {
					for (int j = i+1; j < names.length; j++) {
						if (names[i]==names[j]&& i!=j) {
							System.out.println("the duplicate name is::"+ names[i]);	
						}	
					}
				}
				System.out.println(); // just for empty space
			}
			@Test
			public void hashSet() {
				System.out.println("<<<<<<<<<<<using HASH SET>>>>>>>>>>>>>>>>>>>>>>>");
				Set<String> storeSet= new HashSet<String>();
		
				for (String i : names) {
					if (storeSet.add(i)==false) {
						System.out.println("the duplicate name is::"+ i);
					}
				}
				System.out.println();
			}
			
		
		
			@Test
			public void hashMap() {
				
				System.out.println("<<<<<<<<<<<using HASH MAP>>>>>>>>>>>>>>>>>>>>>>>");
				Map<String,Integer> storeMap= new HashMap<String,Integer>();
		
				for (String i : names) {
					Integer count=storeMap.get(i);
					if (count==null) {
						storeMap.put(i, 1);
					}else {
						storeMap.put(i, ++count);	
					}
				}
				Set<Entry<String,Integer>> entrySet=storeMap.entrySet() ;
				for (Entry<String, Integer> entry : entrySet) {
					if (entry.getValue()>1) {
						System.out.println("the duplicate name is::"+ entry.getKey());
					}
				}
				System.out.println();
			}
	
		}
