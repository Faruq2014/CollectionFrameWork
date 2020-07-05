package com.arraysMultiDimensionSalary;

public class Adding_Two_Year_Salary {

	public static void main(String[] args) {
		/*make a program where 5 employee work for two years and show two years of salary. 
		 * 
		 */
		
		int eighten [][]= {
				//jan  feb  mar  apr  may  jun  jul  aug  sep  oct  nov  dec
				{100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155}, // hridoy
				{101, 106, 111, 116, 121, 126, 131, 136, 141, 146, 151, 156}, // suvo
				{102, 107, 112, 117, 122, 127, 132, 137, 142, 147, 152, 157}, // mahir
				{103, 108, 113, 118, 123, 128, 133, 138, 143, 148, 153, 158}, // belal
				{104, 109, 114, 119, 124, 129, 134, 139, 144, 149, 154, 159}  // kobir
		};
		
	int ninteen [][]= {
			   //jan  feb  mar  apr  may  jun  jul  aug  sep  oct  nov  dec
			    {200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255}, // hridoy
				{201, 206, 211, 216, 221, 226, 231, 236, 241, 246, 251, 256}, // suvo
				{202, 207, 212, 217, 222, 227, 232, 237, 242, 247, 252, 257}, // mahir
				{203, 208, 213, 218, 223, 228, 233, 238, 243, 248, 253, 258}, // belal
				{204, 209, 214, 219, 224, 229, 234, 239, 244, 249, 254, 259} // kobir
		};	

	int[][] total = new int[5][12];    //increment=(2 / salary)*100;  [i][j]/100*5
	int bonus = 0; 
	for (int i = 0; i <5; i++) {	
		for (int j= 0;j <12; j++) { 
			total[i][j]=eighten[i][j]+ninteen[i][j];
			bonus=total[i][j]/100*10;
			System.out.print(total[i][j]+bonus+", ");
			
			//System.out.println(bonus);
			//bonus=total[i][j]/100*5;
			//System.out.println("Name["+i+"]["+j+"]:"+total[i][j]);
		}
		System.out.println();
	}
	}

}
