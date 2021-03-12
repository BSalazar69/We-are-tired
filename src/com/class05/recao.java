package com.class05;

import java.util.Scanner;

public class recao {

	public static void main(String[] args) {
		
		
		Scanner anyVariableName;
		
		anyVariableName=new Scanner(System.in);
		
		// to capture entire sentence
		
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		//to capture a number
		
		int num=anyVariableName.nextInt();
		anyVariableName.nextInt();
		System.out.println(num);
		
		//to capture double
		
		double d=anyVariableName.nextDouble();
		System.out.println(d);
		
		//to capture single character 
		
		anyVariableName.next().charAt(0);
		
		
		
		
		
		
		

	}

}
