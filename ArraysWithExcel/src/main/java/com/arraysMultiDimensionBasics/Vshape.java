package com.arraysMultiDimensionBasics;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Vshape {
	int lines;
	int space;
	Scanner scanner= new Scanner(System.in);
	int input;
	@Test(priority = 1)
	public void astric() {
		
	System.out.println("input");
	lines =scanner.nextInt();
	space=(lines*2)-2;
	
	// main loop
	for (int i = 1; i <=lines; i++) {
	// loop for left side
		for (int L = 1; L <=i; L++) {
		System.out.print("*");	
		}
		//loop for space
		for (int S = 1;  S<=space; S++) {
			System.out.print(" ");
		}
		//loop for right
		for (int R = 1; R<=i; R++) {
			System.out.print("*");
		}
		// decreasing space 
		space=space-2;
		System.out.println();
	}
	}
	@Test(priority = 2)
	public void numeric() {
		
	//System.out.println(input);
	lines =scanner.nextInt();
	space=(lines*2)-2;
	
	// main loop
	for (int i = 1; i <=lines; i++) {
	// loop for left side
		for (int L = 1; L <=i; L++) {
		System.out.print("*");	
		}
		//loop for space
		for (int S = 1;  S<=space; S++) {
			System.out.print(" ");
		}
		//loop for right
		for (int R = 1; R<=i; R++) {
			System.out.print("*");
		}
		// decreasing space 
		space=space-2;
		System.out.println();
	}
	
	}

}
