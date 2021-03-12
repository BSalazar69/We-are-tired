package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * we need to make user pay for soda keep asking user to pay you until it enters
		 * 3
		 * 
		 * if user gives more > 3 ----> please give less money if user gives less <
		 * 3-----> please give more money
		 */

		int money;
		int price = 3;

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter money");
		money = s.nextInt();

		while (money != price) {
			if (money > 3) {
				System.out.println("Give less");
			} else if (money < 3) {
				System.out.println("Give more");
			}
			money = s.nextInt();
		}

		System.out.println("You can have your soda");

	}

}
