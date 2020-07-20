package com.arraysMultiDimensionFundamental;

import org.testng.annotations.Test;

public class SumOfRowAndColumn {
	/*
	 * write a program to initialize integer element of double array of size 4 into 4 and find the
	 * sum of row and column.
	 */
	@Test(priority = 0)
	public void howToPrintArray() {

		int [][] salary= {
			
				{200,300,400,400},
				{500,600,700,100},
				{800,900,500,200},
				{300,400,500,100}            };
	System.out.println("salary arrays are : ");
		for (int i = 0; i <4; i++) {
		
			for (int j = 0; j <4; j++) {
		System.out.print(salary[i][j]+" ");
			}
			System.out.println();
		}
				
		
	}
	
	
@Test(priority =1)
 public void howToSumRow() {
	System.out.println();
	int [][] salary= {
		
			{200,300,400,400},
			{500,600,700,100},
			{800,900,500,200},
			{300,400,500,100}            };
	System.out.println("<<<<<<<<<<<<<<<Sum of row for salary array>>>>>>>>>>>>>>>>>>>>>");
	for (int i = 0; i < salary.length; i++) {
		int sum=0;
		System.out.println("the total of row number "+(i+1));
		for (int j = 0; j < salary[i].length; j++) {
	System.out.print(salary[i][j]+" ");
	sum=sum+salary[i][j];
		}
		System.out.println("="+sum);
	}
			
	}


 
 @Test(priority =2)
 public void howToSumCOL() {
	System.out.println();
	int [][] salary= {
		
			{200,300,400,400},
			{500,600,700,100},
			{800,900,500,200},
			{300,400,500,100}            };
	 System.out.println(">>>>>>>>>>>>>>>>>Sum of column for salary array>>>>>>>>>>>>>>>>>>");
	for (int i = 0; i <4; i++) {
		int sum=0;
		for (int j = 0; j < 4; j++) {
			System.out.println(salary[j][i]+" ");
	sum+=salary[j][i];
		}
		System.out.println("sum of column "+(i+1)+" is : "+sum);
	}
			
	
 }
 
 
	
@Test(priority =3)
public void howToSumJaggedRow() {
	System.out.println();
	int [][] salary= {
		
			{200,300,400},
			{500},
			{800,900,500,200},
			{300,500}            };
	System.out.println("<<<<<<<<<<<<<<<Sum of row for salary of jagged array>>>>>>>>>>>>>>>>>>>>>");
	for (int i = 0; i < salary.length; i++) {
		int sum=0;
		System.out.println("the total of row number "+(i+1));
		for (int j = 0; j < salary[i].length; j++) {
	System.out.print(salary[i][j]+" ");
	sum=sum+salary[i][j];
		}
		System.out.println("="+sum);
	}
			
	}


@Test(priority =4)
public void howToSumJaggedCOL() {
	/*Array become jagged based on row not column. because in declaration rule row declaration is 
	 * Mandatory but not column. to add column individually, we need to run different loop for each
	 * column.  if it is jagged row, the length is different in each iteration for column. 
	 * 
	 */
	System.out.println();
	int [][] salary= {
		
			{200,300,400,100},
			{500,600,700},
			{800,900,500,200},
			{400,500,100} ,
			{}
			};
	 System.out.println(">>>>>>>>>>>>>>>>>Sum of column for salary of jagged array>>>>>>>>>>>>>>>>>>");
	for (int i = 0; i <salary.length;i++ ) {
		int sum=0;
		for (int j = 0; j <salary[0].length ; j++) {
			System.out.println(salary[j][2]+" ");
	        sum+=salary[j][2];
	}
		System.out.println("sum of "+" column is : "+sum);
		break;
	}
	
}


@Test(priority =4)
public void howToSumJaggedCOL1() {
	/*Array become jagged based on row not column. because in declaration rule row declaration is 
	 * Mandatory but not column. to add column individually, we need to run different loop for each
	 * column.  if it is jagged row, the length is different in each iteration for column. 
	 * 
	 */
	System.out.println();
	int [][] salary= {
		
			{200,300,400,100},
			{500,600,700},
			{800,900,500,200},
			{400,500,100} ,
			{}
			};
	 System.out.println(">>>>>>>>>>>>>>>>>Sum of column for salary of jagged array>>>>>>>>>>>>>>>>>>");
	for (int i = 0; i <salary.length;i++ ) {
		int sum=0;
		for (int j = 0; j <salary[0].length ; j++) {
			System.out.println(salary[j][0]+" ");
	        sum+=salary[j][0];
	}
		System.out.println("sum of "+" column is : "+sum);
		break;
	}
	
}


}
