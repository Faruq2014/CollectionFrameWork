package com.arraysMultiDimensionSalary;
/*make a program where 5 employee work for one years and show: 
 * show total of each moth of total salary paid.
 * show their early salary, 
 * show total salry of the whole year
 */
public class Salary_FromDataBase {
	
	
	public static void main(String[] args) {
	
		Salary_FromDataBase as=new Salary_FromDataBase();
		as.salary();
		as.monthlysalary();
		as.yearlyEmployeesalary();
		as.printingRow0();
		as.totalsalary();
		
	}
	
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

	public   void monthlysalary() { 	
		int [][] salary= new int[5][12];
		int count=1000;
		for (int row = 0; row < salary.length; row++) {
			for (int col = 0; col < salary[0].length; col++) {
				salary[row][col]=count;
				count++;
			}
		}		
	// total each month salary paid by the company
	int januarytotal = 0;
	int Febtotal = 0;
	int Marchtotal = 0;
	for ( int i = 0; i < salary.length; i++) {
		januarytotal +=salary[i][0];
		    Febtotal +=salary[i][1];
		  Marchtotal +=salary[i][2];
		
	}
	System.out.println("Total monthly salary of year eighteen is: ");
	System.out.println("janu total is >>>"+januarytotal);
	System.out.println("feb total is >>>>"+Febtotal);
	System.out.println("marh total is >>> "+Marchtotal);
	
	// january employee yearly salary:
	System.out.println("january salary:");
	for (int i = 0; i < salary.length; i++) {
		//columnTotal0 +=salary[i][0];
		System.out.println(salary[i][0]);
	}
	
}
	
	// printing each row require a individual loop 
			
				public void printingRow0() {
					
					int [][] salary= new int[5][12];
					int count=1000;
					for (int row = 0; row < salary.length; row++) {
						for (int col = 0; col < salary[0].length; col++) {
							salary[row][col]=count;
							count++;
						}
					}
					
					System.out.println(" hridoy monthly salary");
					for ( int i = 0; i < salary[0].length; i++) {
						System.out.print(salary[0][i]+" ");
					}	
			
					System.out.println();
				}
			
	public  void yearlyEmployeesalary() {
		int [][] salary= new int[5][12];
		int count=1000;
		for (int row = 0; row < salary.length; row++) {
			for (int col = 0; col < salary[0].length; col++) {
				salary[row][col]=count;
				count++;
			}
		}
		for (int i = 0; i < salary.length; i++) {
			int total=0;
			for (int j = 0; j < salary[0].length; j++) {
			total=total+salary[i][j];
			//total+=salary[i][j];
			}
			System.out.println("number "+ (i+1)  +" employee yearly salary is " +total);
		}
	}
	
	public  void totalsalary() {
		int [][] salary= new int[5][12];
		int count=1000;
		for (int row = 0; row < salary.length; row++) {
			for (int col = 0; col < salary[0].length; col++) {
				salary[row][col]=count;
				count++;
			}
		}	
		int total=0;
		for (int i = 0; i < salary.length; i++) {
		
			for (int j = 0; j < salary.length; j++) {
			
			total+=salary[i][j];
			}
			
		}
		System.out.println(" employee yearly salary is " +total);
	}
	
	}


