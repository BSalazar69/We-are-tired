package com.class10;

public class task1 {
public static void main(String[] args) {

	
	/*
	 * Create an array of chars 
	 * and store grades into it: A,B,C,D,E,F. 
	 * Then print grade B
	 */
	
	char[] grade;
	grade=new char[5];
	
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	//grade[5]='F';
	
	System.out.println(grade[1]);
	
	System.out.println("--------------- Another way of creating an array -------------------");
	
	char[] grades= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
	//char[] grades1;
	//grades1= {}; --> won't work
			System.out.println(grades[6]);
	System.out.println("Number of elements in 2 array "+grades.length);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
