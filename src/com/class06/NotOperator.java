package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean rain=true;
		if(!rain) {
			System.out.println("I will take an park");
		}
		
		boolean boo=!true;
		System.out.println(boo); //"!" makes it False
		
		
		boolean boo1=!false;
		System.out.println(boo1); //"!" makes it true
		

		boolean traffic=false;
		if (!traffic) {
			System.out.println("I will come on time");
		}
		
		String day="monday";
		if (!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		System.out.println("----------------------------------------------------------------");
		
		// NOT operator!---> always placed before the condition
		boolean homework=false;
		if(!homework) {
			System.out.println("I will be happy");
		}
		
		
	}

}
