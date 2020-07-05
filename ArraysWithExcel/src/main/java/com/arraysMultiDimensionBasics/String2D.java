package com.arraysMultiDimensionBasics;

public class String2D {

	public static void main(String[] args) {

        String[][] str = new String[][]
        		{{"Faruq", "Libi"}, {"Fima", "Nisa"},{"Rafid","Rayan"}};
        System.out.println("Two dimensional string array elements are :\n");    
	for (int i = 0; i < 3; i++) 
	{
            for (int j = 0; j < 2; j++) 
	    {
                System.out.println("Name["+i+"]["+j+"]:"+str[i][j]);
            }
	}        
	}

}
