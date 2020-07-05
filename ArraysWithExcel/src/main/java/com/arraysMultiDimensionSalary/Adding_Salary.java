package com.arraysMultiDimensionSalary;
/*make a program where 5 employee work for one years and show: 
 * show total of each moth of total salary paid.
 * show their yearly salary, 
 * show total salary of the whole year
 */
public class Adding_Salary {
	int  salary [][]= {
			//jan  feb  mar  apr  may  jun  jul  aug  sep  oct  nov  dec
			{100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155}, // hridoy
			{101, 106, 111, 116, 121, 126, 131, 136, 141, 146, 151, 156}, // suvo
			{102, 107, 112, 117, 122, 127, 132, 137, 142, 147, 152, 157}, // mahir
			{103, 108, 113, 118, 123, 128, 133, 138, 143, 148, 153, 158}, // belal
			{104, 109, 114, 119, 124, 129, 134, 139, 144, 149, 154, 159}  // kobir
	};
	public static void main(String[] args) {
	
		Adding_Salary as=new Adding_Salary();
		as.monthlysalary();
		as.yearlyEmployeesalary();
		as.printingRow0();
		as.totalsalary();
		
	
	}
	public  void monthlysalary() { 	
		
	// total each month salary paid by the company
	int januarytotal = 0;
	int Febtotal = 0;
	int Marchtotal = 0;
	for (int i = 0; i < salary.length; i++) {
		januarytotal +=salary[i][0];
		    Febtotal +=salary[i][1];
		  Marchtotal +=salary[i][2];
		
	}
	System.out.println("Total monthly salary of year eighteen is: ");
	System.out.println("janu total "+januarytotal);
	System.out.println("feb total "+Febtotal);
	System.out.println("marh total "+Marchtotal);
	
	// january employee yearly salary:
	System.out.println("january salary:");
	for (int i = 0; i < salary.length; i++) {
		//columnTotal0 +=salary[i][0];
		System.out.println(salary[i][0]);
	}
	
}
	
	// printing each row require a individual loop 
			
				public void printingRow0() {
					System.out.println(" hridoy monthly salary");
					for ( int i = 0; i < salary[0].length; i++) {
						System.out.print(salary[0][i]+" ");
					}	
			
					System.out.println();
				}
			
	public  void yearlyEmployeesalary() {
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
		int total=0;
		for (int i = 0; i < salary.length; i++) {
		
			for (int j = 0; j < salary.length; j++) {
			
			total+=salary[i][j];
			}
			
		}
		System.out.println(" employee yearly salary is " +total);
	}
	
	}


