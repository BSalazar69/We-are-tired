package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		
		Scanner s=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Please apply for credit card");
			answer=s.nextLine();
		}while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Ok THNX");
		
		System.out.println("--------------------------------------------------------");
		
		

	}

}
