package com.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num1, num2, sum;
		int odd = 0;
		int even = 0;

		System.out.println("please enter number range");
		num1 = s.nextInt();
		num2 = s.nextInt();

		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}

		}
		System.out.println(even);
		System.out.println(odd);

	}

}
