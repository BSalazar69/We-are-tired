package com.class08;

public class contineKeyword {

	public static void main(String[] args) {

		// skips current execution and goes back to the beginning of the loop if there is any code after itll get skipped
		//
		
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");
			if (i == 3) {
				continue;
			}
			System.out.println("I am inside the loop");
		}

		System.out.println("----------------------------------");

		/*
		 * you need to print 1 to 10 except 5 & 6
		 * 
		 */

		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("----------------------------------");

		/*
		 * print numbers 1 to 40 except those that are divisible by 4
		 * 
		 */

		for (int i = 1; i <= 40; i++) {
			if (i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
