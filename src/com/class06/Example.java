package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	/*
	 * Calculate final price after the discount
	 * we check if there is a sale	
	 * if no sale-->I am not shopping
	 * if there is a sale going on
	 * we ask about the item 
	 * we ask about the price
	 * 
	 * if price is less than 10 ---> apply 5% discount 
	 * if price is 10-100---> apply 10% discount
	 * if price is 100-500 ---> apply 20%
	 * if price is more than 500 --> apply 30%
	 * 
	 * "Which item you purchased , whats the original price, and what discount applies and final price"
	 * 
	 */
		
		Scanner scan;
		String sale;
		double price,discount;
		
		scan=new Scanner(System.in);
		System.out.println("Hello is there a sale going on");
		sale=scan.nextLine();
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("yes there is a sale on shoes");
		}else {
			System.out.println("Sorry no sale come back later");
		}
		price=scan.nextDouble();
		if(price<10) {
			discount=.05;
		if(price>=10 && price <=100);
		    discount=.10;
		if(price>=101 && price <=500);
		   discount=.20;
		}else {
			discount=.30;
		}
		   
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
