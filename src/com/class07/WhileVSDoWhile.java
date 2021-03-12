package com.class07;

public class WhileVSDoWhile {

	public static void main(String[] args) {
		
		//WHILE= first check then execute
		// DO= will execute the block then check.
		// even when condition is FALSE itll execute your code AT LEAST ONCE.
		
		
		
		
		int num=1;
		
		while(num<=5) {
		 System.out.println(num);
		 num++;
		}
		
		System.out.println("-------------------- DO WHILE-----------------");
		
		
		
		int num1=1;
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
