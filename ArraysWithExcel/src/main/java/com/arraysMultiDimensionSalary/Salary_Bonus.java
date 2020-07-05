package com.arraysMultiDimensionSalary;

import org.testng.annotations.Test;

public class Salary_Bonus {

	@Test(priority = 1)
	public void salary() {

		
		int [][] salary= new int[5][12];
		int count=1000;
		for (int row = 0; row < salary.length; row++) {
			for (int col = 0; col < salary[0].length; col++) {
				salary[row][col]=count;
				count++;
			}
		}	
		
		for (int i = 0; i < salary.length; i++) {
			for (int j = 0; j < salary[0].length; j++) {
				System.out.print(salary[i][j]+", ");
			}
			System.out.println();
		}
		
				

	}
	@Test(priority = 2)
	public void bonus() {
		int [][] salary= new int[5][12];
		int count=1000;
		for (int row = 0; row < salary.length; row++) {
			for (int col = 0; col < salary[0].length; col++) {
				salary[row][col]=count;
				count++;
			}
		}
		
		System.out.println("Bonus + salary is:");
		int[][] total = new int[5][12];
		int bonus=0;
		for (int i = 0; i < salary.length; i++) {
			
			for (int j = 0; j < salary[0].length; j++) {
				total[i][j]+=salary[i][j];
				bonus=total[i][j]/100*10;
				System.out.print(salary[i][j]+bonus+", ");
			}
			System.out.println("number "+ (i+1)  +" employee monthly bonus is " +bonus);
		}
		
		
	}
	     @Test(priority = 3)
		public  void yearlyEmployeesalary() {
			int [][] salary= new int[5][12];
			int count=1000;
			for (int row = 0; row < salary.length; row++) {
				for (int col = 0; col < salary[0].length; col++) {
					salary[row][col]=count;
					count++;
				}
			}
			int[][] total = new int[5][12];
			int bonus=0;
			int totalBonus=0;
			for (int i = 0; i < salary.length; i++) {
				for (int j = 0; j < salary[0].length; j++) {
				total[i][j]=+salary[i][j];
				bonus=total[i][j]/100*10;
				totalBonus=total[i][j]+bonus;
				System.out.print(totalBonus+" ,");
				}
				System.out.println();
				//System.out.println("number "+ (i+1)  +" employee yearly salary is " +total);
			}
		}
		
	
}
