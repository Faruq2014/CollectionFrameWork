		package com.arraysMultiDimensionBasics;
		
		import org.testng.annotations.Test;
		
		public class PrintingOnly_Row {
		
			int[][] num = {
					{1,2,3,4},
					{2,3,4,1},
					{3,2,1,4},
		
			};
			
			
			int i;
		    int j;
			
			public PrintingOnly_Row() {
				for ( i = 0; i < num.length; i++) {
					System.out.println("_________________");
					for (  j = 0; j < num[0].length; j++) {
						System.out.println("Number["+i+"]["+j+"]:"+num[i][j]);	
						//System.out.println(num[i][j]);
					}
				}
			}
		
		
			// printing each row require a individual loop 
			@Test(priority = 1)
			public void printingRow0() {
				System.out.println("printing each row individualy");
				for ( i = 0; i < num[0].length; i++) {
					System.out.print(num[0][i]+" ");
				}	
		
				System.out.println("row 1");
			}
			@Test(priority = 2)
			public void printingRow1() {
				for (i = 0; i < num[1].length; i++) {
					System.out.print(num[1][i]+" ");
				}	
		
				System.out.println("row 2");
			}
		
			@Test(priority = 3)
			public void printingRow2() {
				for (i = 0; i < num[0].length; i++) {
					System.out.print(num[2][i]+" ");
				}	
		
				System.out.println("row3");
			}
		
		
		
		}
