package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
	/*
	 * we play lotto and we have win number which is 17
	 * we need to keep asking a user to enter any number from 1 to 100 
	 * UNTIL correct number is entered
	 */
		
		Scanner scan=new Scanner(System.in);
		int num;
		int lottoNum=17;
		
		
		
		do {
		System.out.println("Please enter any number from 1 to 100 to win");
		num=scan.nextInt();
		}while(num!=lottoNum);
		
		System.out.println("Congrats you entered "+num+" which is a lucky number");
		
		
		
		

	}

}
