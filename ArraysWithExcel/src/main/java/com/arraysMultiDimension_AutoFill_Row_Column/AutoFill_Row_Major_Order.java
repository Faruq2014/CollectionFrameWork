		package com.arraysMultiDimension_AutoFill_Row_Column;
		
		public class AutoFill_Row_Major_Order {
		
			public static void main(String[] args) {
				System.out.println("in order array");
				inOrder();
				
				System.out.println("reverse Orderr array");
				reverseOrder();
			}
			
			
			public static void inOrder() {
			
		int [][] data= new int[10][5];
		int count=1;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[0].length; col++) {
				data[row][col]=count;
				count++;
			}
		}	
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j]+", ");
			}
			System.out.println();
		}
				
			}
			
			
			public static void reverseOrder() {
		// auto fill reverse order
		int [][] data= new int[10][5];
		int count=1;
		for (int row = data.length-1; row >=0; row--) {
			for (int col = data[0].length-1; col>=0 ; col--) {
				data[row][col]=count;
				count++;
			}
		}
		
		//for printing
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j]+", ");
			}
			System.out.println();
		}
			
			}
		}
