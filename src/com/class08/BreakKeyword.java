package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		// "break;" breaks the loop as soon as java see that keyword it gets out of the
		// loop body

		boolean rain = true;
		int temp = 60;

		while (rain) {
			System.out.println("I will stay at home");

			if (temp > 75) {
				System.out.println("I will walk under warm rain");
				break;
			}
			temp += 2;

		}

		System.out.println("----------------------------------------------------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println("hello");

			if (i == 5) {
				break;
			}
			System.out.println("I am inside the loop");
		}

		
		
		
		
	}

}
